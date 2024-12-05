from langchain.schema import Document
from langchain.llms import OpenAI
from langchain.prompts import PromptTemplate
from langchain.chains import LLMChain
from input_parser import collect_java_files, prioritize_files, preprocess_files
import json
import os
from langchain.chat_models import ChatOpenAI
import tiktoken
import time
from datetime import datetime
import random
import math

class CryptoMisusePlanner:
    def __init__(self, openai_api_key, max_tokens_per_batch=15000, batch_file="batched_input.json",
                 confidence_threshold=0.8):
        self.openai_api_key = openai_api_key
        self.max_tokens_per_batch = max_tokens_per_batch
        self.batch_file = batch_file
        self.llm = ChatOpenAI(model="gpt-4o-mini", temperature=0, openai_api_key=openai_api_key)
        self.confidence_threshold = confidence_threshold  # Threshold for delegating to second-level agents

        # Second-level agents (to be implemented separately)
        self.second_level_agents = {
            "MD5": self.md5_agent,
            "SHA1": self.sha1_agent,
            "AES_ECB": self.aes_ecb_agent,
            "Trust_All_Certificates": self.certificate_agent,
            "Allow_All_Hostnames": self.hostname_agent
        }

    # def integrate_results_with_validation(planner_result, second_level_results):
    #     final_predictions = {}
    #     for vuln, score in planner_result.items():
    #         if vuln in second_level_results and second_level_results[vuln] == "Vulnerable":
    #             final_predictions[vuln] = "Vulnerable"
    #         else:
    #             final_predictions[vuln] = "Not Vulnerable"
    #     return final_predictions
    #
    # def integrate_results_with_threshold(planner_result, second_level_results, confidence_threshold=0.8):
    #     final_predictions = {}
    #     for vuln, score in planner_result.items():
    #         if score >= confidence_threshold and vuln in second_level_results and second_level_results[
    #             vuln] == "Vulnerable":
    #             final_predictions[vuln] = "Vulnerable"
    #         else:
    #             final_predictions[vuln] = "Not Vulnerable"
    #     return final_predictions
    #
    # def integrate_results_weighted(planner_result, second_level_results, planner_weight=0.7, agent_weight=0.3):
    #     final_predictions = {}
    #     for vuln, score in planner_result.items():
    #         agent_score = 1 if second_level_results.get(vuln) == "Vulnerable" else 0
    #         final_score = planner_weight * score + agent_weight * agent_score
    #         final_predictions[vuln] = "Vulnerable" if final_score > 0.8 else "Not Vulnerable"
    #     return final_predictions

    # def store_final_predictions(self, planner_results, second_level_results):
    #     """
    #     Store final predictions while preserving the original planner's response.
    #     Adds a new field 'Final Predictions' to the results.
    #     """
    #     final_results = []
    #
    #     for i, result in enumerate(planner_results):
    #         # Ensure result is a dictionary
    #         if not isinstance(result, dict):
    #             raise TypeError(f"Expected result to be a dictionary, got {type(result)}: {result}")
    #
    #         # Extract planner response
    #         response_lines = result.get("response", "").splitlines()
    #         detected_vulnerabilities = []
    #
    #         if len(response_lines) > 1:
    #             planner_vulnerabilities = response_lines[1].split(", ")
    #         else:
    #             planner_vulnerabilities = []
    #
    #         # Determine final predictions
    #         for vuln in planner_vulnerabilities:
    #             if vuln in second_level_results[i] and second_level_results[i][vuln] == "Vulnerable":
    #                 detected_vulnerabilities.append(vuln)
    #
    #         # Format final predictions
    #         final_predictions = "Vulnerable\n" + ", ".join(
    #             detected_vulnerabilities) if detected_vulnerabilities else "None Vulnerability Found"
    #
    #         # Add the final predictions field
    #         result["Final Predictions"] = final_predictions
    #         final_results.append(result)
    #
    #     return final_results

    def adjust_scores(self, scores):
        """
        Dynamically adjust scores to introduce variability based on document features.
        """
        adjusted_scores = {}
        for vuln, score in scores.items():
            adjusted_scores[vuln] = min(1.0, max(0.0, score + random.uniform(-0.05, 0.05)))  # Add slight randomness
        return adjusted_scores


    def analyze_batch(self, batch, batch_id=None):
        """
        Analyze a batch of Java files using the GPT-4 LLM and determine if second-level agents are needed.
        """
        template = """
            You are a cybersecurity expert specializing in cryptographic API misuse detection.
            Analyze the following Java code and predict the likelihood of each of these vulnerabilities being present:

            1. Only AES for encryption
            Description: The code uses AES encryption exclusively without considering other algorithms, which may limit security options.
            Example:
            Cipher cipher = Cipher.getInstance("AES");

            2. AES with ECB for encryption
            Description: The code uses AES with ECB (Electronic Codebook) mode, which is insecure due to deterministic output for identical plaintext.
            Example:
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

            3. AES with CBC for encryption
            Description: The code uses AES with CBC (Cipher Block Chaining) mode without proper IV handling, which can lead to security issues.
            Example:
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            4. No cleanpassword() call after using PBEKeySpec
            Description: The code fails to call `cleanPassword()` after using `PBEKeySpec`, which can leave sensitive data in memory.
            Example:
            PBEKeySpec keySpec = new PBEKeySpec(password);
            // Missing keySpec.clearPassword();

            5. MD5 hashing
            Description: The code uses the MD5 hashing algorithm, which is considered insecure and prone to collisions.
            Example:
            MessageDigest md = MessageDigest.getInstance("MD5");

            6. SHA1 hashing
            Description: The code uses the SHA-1 hashing algorithm, which is deprecated due to vulnerabilities.
            Example:
            MessageDigest sha1 = MessageDigest.getInstance("SHA1");

            7. Trusting all certificates
            Description: The code trusts all SSL certificates, which exposes the system to man-in-the-middle attacks.
            Example:
            TrustManager[] trustAllCerts = new TrustManager[] {{
                new X509TrustManager() {{
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {{}}
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {{}}
                    public X509Certificate[] getAcceptedIssuers() {{ return null; }}
                }}
            }};

            8. Allowing all hostnames
            Description: The code allows all hostnames, which can bypass hostname verification and enable spoofing.
            Example:
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);

            9. "SSL" as context
            Description: The code uses "SSL" as the security context, which is outdated and insecure.
            Example:
            SSLContext sslContext = SSLContext.getInstance("SSL");

            10. "TLSv1" as context
                Description: The code uses "TLSv1" as the security context, which is considered insecure and outdated.
                Example:
                SSLContext sslContext = SSLContext.getInstance("TLSv1");

            Code:
            {code}

            If the code is vulnerable, respond with:
            "Vulnerable"
            Followed by a list of detected vulnerabilities and their likelihood scores (e.g., 1: 0.85, 3: 0.90).
            Only include the detected vulnerabilities and scores in your response. Do not list the undetected vulnerabilities.
            Example:
            Vulnerable
            1: 0.75
            5: 0.90

            If the code is not vulnerable, respond with:
            "None Vulnerability Found"
            """

        prompt = PromptTemplate(input_variables=["code"], template=template)

        # Map indices to vulnerability names
        vulnerability_mapping = {
            "1": "Only_AES",
            "2": "AES_ECB",
            "3": "AES_CBC",
            "4": "No_CleanPassword",
            "5": "MD5",
            "6": "SHA1",
            "7": "Trust_All_Certificates",
            "8": "Allow_All_Hostnames",
            "9": "SSL_Context",
            "10": "TLSv1_Context",
        }

        planner_decision_threshold = 0.85 # threshold for directly using planner's prediction

        results = []
        for i, doc in enumerate(batch):
            # Generate the planner's query
            query = prompt.format(code=doc.page_content)
            if self.count_tokens(query) > 128000:
                print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
                continue

            # Run the planner
            planner_result = self.llm.predict(query)
            results.append({"Batch ID": batch_id, "Document ID": i, "response": planner_result.strip()})

            # Parse the planner's response to extract detected vulnerabilities and scores
            scores = self.parse_vulnerability_scores(planner_result)
            print(f"Vulnerability scores for document {i} in batch {batch_id}: {scores}")

            # Track vulnerabilities detected in the final report
            final_vulnerabilities = []

            # Process each detected vulnerability
            for vuln_index, score in scores.items():
                vuln_name = vulnerability_mapping.get(vuln_index)

                if vuln_name in self.second_level_agents:
                    if score < planner_decision_threshold and score > self.confidence_threshold:  # Trigger second-level agent
                        print(f"Delegating to second-level agent for {vuln_name} in document {i} in batch {batch_id}")
                        second_level_result = self.second_level_agents[vuln_name](doc.page_content, i=i,
                                                                                  batch_id=batch_id)
                        results[-1][f"{vuln_name}_details"] = second_level_result

                        # Final decision based on second-level agent
                        if "Not Vulnerable" not in second_level_result:
                            final_vulnerabilities.append(vuln_index)
                    else:
                        # Planner decision is above inclusion threshold
                        if score >= planner_decision_threshold:
                            final_vulnerabilities.append(vuln_index)
                            results[-1][f"{vuln_name}_details"] = "Predicted based on planner confidence"
                else:
                    # For vulnerabilities without second-level agents
                    if score >= planner_decision_threshold:
                        final_vulnerabilities.append(vuln_index)
                        results[-1][f"{vuln_name}_details"] = "Predicted based on planner confidence"

            # Set the final_predictions field based on detected vulnerabilities
            if final_vulnerabilities:
                results[-1]["final_predictions"] = "Vulnerable\n" + ", ".join(final_vulnerabilities)
            else:
                results[-1]["final_predictions"] = "None Vulnerability Found"

        return results

    def parse_vulnerability_scores(self, response):
        """
        Parse the planner's response to extract vulnerability scores.
        """
        scores = {}
        try:
            lines = response.splitlines()[1:]  # Skip the "Vulnerability Scores" header
            for line in lines:
                vuln, score = line.split(":")
                scores[vuln.strip()] = float(score.strip())
        except Exception as e:
            print(f"Error parsing response: {e}")
        return scores

    def count_tokens(self, text, model="gpt-4o-mini"):
        """
        Count the number of tokens in the given text.
        """
        tokenizer = tiktoken.encoding_for_model(model)
        return len(tokenizer.encode(text))

    def md5_agent(self, code, log_dir="second_level_logs", i=None, batch_id=None):
        """
        Specialized second-level agent for detecting MD5 vulnerabilities.
        Logs the results of the analysis for auditing purposes.
        """
        # Ensure the log directory exists
        os.makedirs(log_dir, exist_ok=True)
        # MD5 vulnerability prompt with examples
        template = """
                You are a cybersecurity expert specializing in detecting MD5 hashing vulnerabilities.
                MD5 is considered insecure due to its susceptibility to collision attacks.

                Your task is to analyze the following Java code and determine if MD5 hashing is used.

                Here are some examples of MD5 usage for reference:
                Example 1:
                public class BrokenHashABICase2 {{
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String str = "abcdef";
                        String crypto = "MD5";
                        go(str,crypto);
                    }}
                    public static void go (String str, String crypto) throws NoSuchAlgorithmException {{
                        MessageDigest md = MessageDigest.getInstance(crypto);
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                    }}
                }}

                Example 2:
                public class BrokenHashABICase10 {{
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String str = "abcdef";
                        String crypto = "MD5";
                        method2(str,crypto);
                    }}
                    public static void method2 (String s, String cryptoHash) throws NoSuchAlgorithmException {{
                        String str2 = s;
                        String hashAlgo = cryptoHash;
                        method1(str2,hashAlgo);
                    }}
                    public static void method1 (String str, String crypto) throws NoSuchAlgorithmException {{
                        MessageDigest md = MessageDigest.getInstance(crypto);
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                    }}
                }}

                Example 3:
                public class BrokenHashABPSCase2 {{
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String name = "abcdef";
                        int choice = 2;
                        MessageDigest md = MessageDigest.getInstance("MD5");
                        if(choice>1)
                            md = MessageDigest.getInstance("SHA-256");
                        md.update(name.getBytes());
                        System.out.println(md.digest());
                    }}
                }}

                Example 4:
                public class BrokenHashABICase6 {{
                    public static final String DEFAULT_CRYPTO = "MD5";
                    private static char[] CRYPTO;
                    private static char[] crypto;
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String str = "abcdef";
                        go2();
                        go3();
                        go(str);
                    }}

                    private static void go2(){{
                        CRYPTO = DEFAULT_CRYPTO.toCharArray();
                    }}
                    private static void go3(){{
                        crypto = CRYPTO;
                    }}

                    public static void go (String str) throws NoSuchAlgorithmException {{
                        MessageDigest md = MessageDigest.getInstance(String.valueOf(crypto));
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                    }}
                }}

                If MD5 usage is detected, respond with:
                "Vulnerable"
                Followed by the specific code snippet(s) where MD5 is used.

                If no MD5 usage is detected, respond with:
                "Not Vulnerable"
                
                Do not include any additional explanation, examples, or context in your response. Keep your response concise and focused on the findings.

                Code:
                {code}

                Your response:
                """

        prompt = PromptTemplate(input_variables=["code"], template=template)
        query = prompt.format(code=code)
        if self.count_tokens(query) > 128000:
            print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
            return "Not Vulnerable"
        result = self.llm.predict(query)
        # Log the result
        # log_entry = {
        #     "timestamp": datetime.now().isoformat(),
        #     "input_code_snippet": code,
        #     "analysis_result": result
        # }
        # log_file = os.path.join(log_dir, f"md5_log_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json")
        # with open(log_file, "w", encoding="utf-8") as f:
        #     json.dump(log_entry, f, indent=4)

        # print(f"MD5 Agent log saved to: {log_file}")
        return result

    def sha1_agent(self, code, log_dir="second_level_logs", i=None, batch_id=None):
        """
        Specialized second-level agent for detecting SHA1 vulnerabilities.
        Logs the results of the analysis for auditing purposes.
        """
        # Ensure the log directory exists
        os.makedirs(log_dir, exist_ok=True)
        # MD5 vulnerability prompt with examples
        template = """
                You are a cybersecurity expert specializing in detecting SHA1 hashing vulnerabilities.
                SHA1 is considered insecure due to its susceptibility to collision attacks and has been deprecated for many cryptographic applications.
                
                Your task is to analyze the following Java code and determine if SHA1 hashing is used.
                
                Here are some examples of SHA1 usage for reference:
                Example 1:
                public class BrokenHashBBCase1 {{
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String name = "abcdef";
                        MessageDigest md = MessageDigest.getInstance("SHA1");
                        md.update(name.getBytes());
                        System.out.println(md.digest());
                    }}
                }}
                
                Example 2:
                public class BrokenHashABICase1 {{
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String str = "abcdef";
                        String crypto = "SHA1";
                        go(str,crypto);
                    }}
                    public static void go (String str, String crypto) throws NoSuchAlgorithmException {{
                        MessageDigest md = MessageDigest.getInstance(crypto);
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                    }}
                }}
                
                Example 3:
                public class BrokenHashABICase9 {{
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String str = "abcdef";
                        String crypto = "SHA1";
                        method2(str,crypto);
                    }}
                    public static void method2 (String s, String cryptoHash) throws NoSuchAlgorithmException {{
                        String str2 = s;
                        String hashAlgo = cryptoHash;
                        method1(str2,hashAlgo);
                    }}
                    public static void method1 (String str, String crypto) throws NoSuchAlgorithmException {{
                        MessageDigest md = MessageDigest.getInstance(crypto);
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                    }}
                }}
                
                Example 4:
                public class BrokenHashABSCase1 {{
                    CryptoHash1 crypto;
                    public BrokenHashABSCase1() throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {{
                        crypto = new CryptoHash1("SHA1");
                        crypto.encrypt("abc","");
                    }}
                }}

                class CryptoHash1 {{
                    String crypto;
                
                    public CryptoHash1(String defCrypto) throws NoSuchPaddingException, NoSuchAlgorithmException {{
                        crypto = defCrypto;
                    }}
                
                    public void encrypt(String str, String passedAlgo) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException {{
                        if(passedAlgo.isEmpty()){{
                            passedAlgo = crypto;
                        }}
                
                        MessageDigest md = MessageDigest.getInstance(crypto);
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                
                    }}
                }}
                
                Example 5:
                public class BrokenHashABICase5 {{
                    public static final String DEFAULT_CRYPTO = "SHA1";
                    private static char[] CRYPTO;
                    private static char[] crypto;
                    public static void main (String [] args) throws NoSuchAlgorithmException {{
                        String str = "abcdef";
                        go2();
                        go3();
                        go(str);
                    }}
                
                    private static void go2(){{
                        CRYPTO = DEFAULT_CRYPTO.toCharArray();
                    }}
                    private static void go3(){{
                        crypto = CRYPTO;
                    }}
                
                    public static void go (String str) throws NoSuchAlgorithmException {{
                        MessageDigest md = MessageDigest.getInstance(String.valueOf(crypto));
                        md.update(str.getBytes());
                        System.out.println(md.digest());
                    }}
                }}
                                
                If SHA1 usage is detected, respond with:
                "Vulnerable"
                Followed by the specific code snippet(s) where SHA1 is used.
                
                If no SHA1 usage is detected, respond with:
                "Not Vulnerable"
                
                Do not include any additional explanation, examples, or context in your response. Keep your response concise and focused on the findings.
                
                Code:
                {code}
                
                Your response:
                """

        prompt = PromptTemplate(input_variables=["code"], template=template)
        query = prompt.format(code=code)
        if self.count_tokens(query) > 128000:
            print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
            return "Not Vulnerable"
        result = self.llm.predict(query)
        # Log the result
        # log_entry = {
        #     "timestamp": datetime.now().isoformat(),
        #     "input_code_snippet": code,
        #     "analysis_result": result
        # }
        # log_file = os.path.join(log_dir, f"sha1_log_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json")
        # with open(log_file, "w", encoding="utf-8") as f:
        #     json.dump(log_entry, f, indent=4)

        # print(f"SHA1 Agent log saved to: {log_file}")
        return result

    def aes_ecb_agent(self, code, log_dir="second_level_logs", i=None, batch_id=None):
        """
        Specialized second-level agent for detecting AES with ECB encrption vulnerabilities.
        Logs the results of the analysis for auditing purposes.
        """
        # Ensure the log directory exists
        os.makedirs(log_dir, exist_ok=True)
        # MD5 vulnerability prompt with examples
        template = """
                You are a cybersecurity expert specializing in detecting cryptographic vulnerabilities, specifically the use of AES encryption with ECB (Electronic Codebook) mode.
                
                AES with ECB is considered insecure because it produces deterministic output for identical plaintext blocks, revealing patterns in the encrypted data. This vulnerability undermines the confidentiality of the encryption.
                
                Your task is to analyze the following Java code and determine if AES encryption with ECB mode is used.
                
                Here are some examples of AES with ECB usage for reference:
                Example 1:
                public class EcbInSymmCryptoBBCase1 {{

                    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                        SecretKey key = keyGen.generateKey();
                        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                        cipher.init(Cipher.ENCRYPT_MODE, key);
                    }}
                
                    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        EcbInSymmCryptoBBCase1 bc = new EcbInSymmCryptoBBCase1();
                        bc.go();
                    }}

                }}
                
                Example 2:
                public class EcbInSymmCryptoABICase1 {{
                    public void go(String crypto) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                        SecretKey key = keyGen.generateKey();
                        Cipher cipher = Cipher.getInstance(crypto);
                        cipher.init(Cipher.ENCRYPT_MODE, key);
                    }}
                
                    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        EcbInSymmCryptoABICase1 bc = new EcbInSymmCryptoABICase1();
                        String crypto = "AES/ECB/PKCS5Padding";
                        bc.go(crypto);
                    }}
                }}
                
                Example 3:
                public class EcbInSymmCryptoABICase3 {{
                    public static void method2(String c) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        String cryptoAlgo = c;
                        method1(cryptoAlgo);
                    }}
                    public static void method1(String crypto) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                        SecretKey key = keyGen.generateKey();
                        Cipher cipher = Cipher.getInstance(crypto);
                        cipher.init(Cipher.ENCRYPT_MODE, key);
                    }}
                
                    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        String crypto = "AES/ECB/PKCS5Padding";
                        method2(crypto);
                    }}
                }}
                
                Example 4:
                public class EcbInSymmCryptoABSCase1 {{
                    CryptoECB1 crypto;
                    public EcbInSymmCryptoABSCase1() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        String cryptoAlgo = "AES/ECB/PKCS5Padding";
                        crypto = new CryptoECB1(cryptoAlgo);
                        crypto.method1("");
                    }}
                }}

                class CryptoECB1 {{
                    String defAlgo;
                
                    public CryptoECB1(String algo) {{
                        defAlgo = algo;
                    }}
                
                    public void method1(String passedAlgo) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {{
                
                        if(passedAlgo.isEmpty()){{
                            passedAlgo = defAlgo;
                        }}
                
                        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                        SecretKey key = keyGen.generateKey();
                        Cipher cipher = Cipher.getInstance(passedAlgo);
                        cipher.init(Cipher.ENCRYPT_MODE, key);
                
                    }}
                }}
                
                Example 5:
                public class EcbInSymmCryptoABICase2 {{
                    public static final String DEFAULT_CRYPTO = "AES/ECB/PKCS5Padding";
                    private static char[] CRYPTO;
                    private static char[] crypto;
                    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                        SecretKey key = keyGen.generateKey();
                        Cipher cipher = Cipher.getInstance(String.valueOf(crypto));
                        cipher.init(Cipher.ENCRYPT_MODE, key);
                    }}
                    private static void go2(){{
                        CRYPTO = DEFAULT_CRYPTO.toCharArray();
                    }}
                    private static void go3(){{
                        crypto = CRYPTO;
                    }}
                
                    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {{
                        EcbInSymmCryptoABICase2 bc = new EcbInSymmCryptoABICase2();
                        go2();
                        go3();
                        bc.go();
                    }}
                }}
                
                If AES with ECB usage is detected, respond with:
                "Vulnerable"
                Followed by the specific code snippet(s) where AES with ECB is used.
                
                If no AES with ECB usage is detected, respond with:
                "Not Vulnerable"
                
                Do not include any additional explanation, examples, or context in your response. Keep your response concise and focused on the findings.
                
                Code:
                {code}
                
                Your response:
                """

        prompt = PromptTemplate(input_variables=["code"], template=template)
        query = prompt.format(code=code)
        if self.count_tokens(query) > 128000:
            print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
            return "Not Vulnerable"
        result = self.llm.predict(query)
        # Log the result
        # log_entry = {
        #     "timestamp": datetime.now().isoformat(),
        #     "input_code_snippet": code,
        #     "analysis_result": result
        # }
        # log_file = os.path.join(log_dir, f"aes_ecb_log_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json")
        # with open(log_file, "w", encoding="utf-8") as f:
        #     json.dump(log_entry, f, indent=4)

        # print(f"AES ECB Agent log saved to: {log_file}")
        return result

    def certificate_agent(self, code, log_dir="second_level_logs", i=None, batch_id=None):
        """
        Specialized second-level agent for detecting trusting all certificates vulnerabilities.
        Logs the results of the analysis for auditing purposes.
        """
        # Ensure the log directory exists
        os.makedirs(log_dir, exist_ok=True)
        # MD5 vulnerability prompt with examples
        template = """
                You are a cybersecurity expert specializing in detecting cryptographic vulnerabilities, specifically the improper practice of trusting all SSL certificates.

                Trusting all certificates is insecure because it bypasses the standard certificate validation process, exposing the application to man-in-the-middle (MITM) attacks. It undermines the authenticity and confidentiality of secure communications.
                
                Your task is to analyze the given Java code and determine if it improperly trusts all certificates.
                
                Before you investigate the code, here are some examples of code that trusts all certificates. These examples are only provided for reference, do not analyze them in your response.
                ###### EXAMPLES START ######
                Example 1:
                Input:
                public class DummyCertValidationCase1 implements X509TrustManager {{
                    private X509TrustManager trustManager;
                    @Override
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {{
                        //Trust any client connecting (no certificate validation)
                        trustManager.checkClientTrusted(x509Certificates,s);
                    }}
                
                    @Override
                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {{
                        //Trust any remote server (no certificate validation)
                
                    }}
                
                    @Override
                    public X509Certificate[] getAcceptedIssuers() {{
                
                        //return null;
                        return new X509Certificate[0];
                    }}
                }}
                Output: Vulnerable
                
                Example 2:
                Input: 
                public class DummyCertValidationCase2 implements X509TrustManager {{

                    @Override
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {{
                
                    }}
                
                    @Override
                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {{
                    }}
                
                    @Override
                    public X509Certificate[] getAcceptedIssuers() {{
                        return new X509Certificate[0];
                    }}
                }}
                Output: Vulnerable
                
                Example 3:
                Input:
                public class DummyCertValidationCase3 implements X509TrustManager {{
                    @Override
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {{
                
                    }}
                
                    @Override
                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {{
                
                    }}
                
                    @Override
                    public X509Certificate[] getAcceptedIssuers() {{
                        return null;
                    }}
                }}
                Output: Vulnerable
                ###### EXAMPLES END ######

                In the code below, if trusting all certificates is detected, respond with:
                "Vulnerable"
                Followed by the specific code snippet(s) where trusting all certificates occurs.
                
                If trusting all certificates is not detected, respond with:
                "Not Vulnerable"
                
                Do not include any additional explanation, examples, or context in your response. Keep your response concise and focused on the findings.
                
                Code you should analyze:
                ###### CODE START ######
                {code}
                ###### CODE END ######
                
                Your response:
                """

        prompt = PromptTemplate(input_variables=["code"], template=template)
        query = prompt.format(code=code)
        if self.count_tokens(query) > 128000:
            print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
            return "Not Vulnerable"
        result = self.llm.predict(query)
        # Log the result
        # log_entry = {
        #     "timestamp": datetime.now().isoformat(),
        #     "input_code_snippet": code,
        #     "analysis_result": result
        # }
        # log_file = os.path.join(log_dir, f"certificate_log_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json")
        # with open(log_file, "w", encoding="utf-8") as f:
        #     json.dump(log_entry, f, indent=4)

        # print(f"Certificate Agent log saved to: {log_file}")
        return result

    def hostname_agent(self, code, log_dir="second_level_logs", i=None, batch_id=None):
        """
        Specialized second-level agent for detecting trusting all certificates vulnerabilities.
        Logs the results of the analysis for auditing purposes.
        """
        # Ensure the log directory exists
        os.makedirs(log_dir, exist_ok=True)
        # MD5 vulnerability prompt with examples
        template = """
                You are a cybersecurity expert specializing in detecting cryptographic vulnerabilities, specifically the insecure practice of allowing all hostnames.
                
                Allowing all hostnames bypasses standard hostname verification, which exposes the application to man-in-the-middle (MITM) attacks. This vulnerability compromises the authenticity of secure communications.
                
                Your task is to analyze the following Java code and determine if it improperly allows all hostnames.
                
                Here is an example of code that allows all hostnames:
                Vulnerable Code:
                public class DummyHostNameVerifierCase1 implements HostnameVerifier {{
                    public boolean verify(String s, SSLSession sslSession) {{
                        return true;
                    }}
                }}
                
                Here is the corresponding fix for this vulnerability:
                Fixed Code:
                public class DummyHostNameVerifierCorrected implements HostnameVerifier {{
                    public boolean verify(String hostname, SSLSession sslSession) {{
                        if ("192.168.0.10".equals(hostname)) {{
                            return true;
                        }} else {{
                            HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
                            return hv.verify(hostname, sslSession);
                        }}
                    }}
                }}
                
                If allowing all hostnames is detected, respond with:
                "Vulnerable"
                Followed by the specific code snippet(s) where hostname verification is bypassed.
                
                If allowing all hostnames is not detected, respond with:
                "Not Vulnerable"
                
                Do not include any additional explanation, examples, or context in your response. Keep your response concise and focused on the findings.
                
                Code:
                {code}
                
                Your response:
                """

        prompt = PromptTemplate(input_variables=["code"], template=template)
        query = prompt.format(code=code)
        if self.count_tokens(query) > 128000:
            print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
            return "Not Vulnerable"
        result = self.llm.predict(query)
        # Log the result
        # log_entry = {
        #     "timestamp": datetime.now().isoformat(),
        #     "input_code_snippet": code,
        #     "analysis_result": result
        # }
        # log_file = os.path.join(log_dir, f"hostname_log_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json")
        # with open(log_file, "w", encoding="utf-8") as f:
        #     json.dump(log_entry, f, indent=4)

        # print(f"Hostname Agent log saved to: {log_file}")
        return result

    def hybrid_sampling(self, total_batches, interval=10, min_samples=10, small_apk_threshold=100, high_fraction=0.2):
        """
        Hybrid sampling strategy:
        - For smaller APKs (<small_apk_threshold batches), sample a higher percentage.
        - For larger APKs, sample at a fixed interval.
        """
        if total_batches < small_apk_threshold:
            # Proportional sampling for smaller APKs
            num_samples = max(min_samples, math.ceil(total_batches * high_fraction))
            sampled_indices = random.sample(range(total_batches), num_samples)
        else:
            # Uniform sampling for larger APKs
            sampled_indices = list(range(0, total_batches, interval))
        return sorted(sampled_indices)

    def run_analysis(self, source_code_dir, batch_size=10, results_dir="analysis_results"):
        """
        Run the planner's analysis pipeline iteratively.
        """
        # Step 1: Check if batched input exists
        if os.path.exists(self.batch_file):
            print(f"Loading existing batches from {self.batch_file}...")
            with open(self.batch_file, "r", encoding="utf-8") as f:
                serialized_batches = json.load(f)

            # # Apply hybrid sampling
            # total_batches = len(serialized_batches)
            # sampled_indices = self.hybrid_sampling(total_batches)

            # Filter the serialized batches based on sampled indices
            # sampled_batches = [serialized_batches[i] for i in sampled_indices]
            # print(f"Sampled {len(sampled_batches)} batches out of {total_batches} total batches.")
        else:
            print("Batched input not found. Creating new batches...")

            # Collect and preprocess files
            all_java_files = collect_java_files(source_code_dir)
            prioritized_files = prioritize_files(all_java_files)
            batches = preprocess_files(prioritized_files, self.max_tokens_per_batch)

            # Convert batches of Document objects into serializable format (excluding metadata)
            serialized_batches = [
                [doc.page_content for doc in batch]  # Store only the content
                for batch in batches
            ]

            # Save batches to file
            with open(self.batch_file, "w", encoding="utf-8") as f:
                json.dump(serialized_batches, f, indent=4)
            print(f"Batches saved to {self.batch_file}.")

        # Step 2: Deserialize batches into Document objects (excluding metadata)
        deserialized_batches = [
            [Document(page_content=doc) for doc in batch]  # Recreate Document objects from content
            for batch in serialized_batches
        ]
        # deserialized_batches = [
        #     [Document(page_content=doc) for doc in batch]  # Recreate Document objects from content
        #     for batch in sampled_batches
        # ]

        # deserialized_batches = deserialized_batches[:100]  # For testing purposes
        # process all the reamining batches
        # Adjust the starting point for processing
        delta = 0
        deserialized_batches = deserialized_batches[delta:]

        # Ensure results directory exists
        os.makedirs(results_dir, exist_ok=True)

        # Step 3: Iteratively analyze batches
        for i in range(0, len(deserialized_batches), batch_size):
            # Adjust the batch index based on the delta
            start_batch_index = delta + i + 1
            end_batch_index = delta + i + batch_size

            print(
                f"Processing batches {start_batch_index} to {min(end_batch_index, len(deserialized_batches) + delta)}...")
            batch_chunk = deserialized_batches[i:i + batch_size]

            all_results = []
            for j, batch in enumerate(batch_chunk):
                # Adjust the batch number based on delta
                current_batch_index = delta + i + j
                print(f"Analyzing batch {current_batch_index + 1} of {len(deserialized_batches) + delta}...")
                batch_results = self.analyze_batch(batch, current_batch_index)
                all_results.extend(batch_results)

            # Save results for the current chunk, include delta in the filename
            chunk_results_file = os.path.join(
                results_dir,
                f"results_batch_{start_batch_index}_to_{min(end_batch_index, len(deserialized_batches) + delta)}.json"
            )
            with open(chunk_results_file, "w", encoding="utf-8") as f:
                json.dump(all_results, f, indent=4)

            print(
                f"Results for batches {start_batch_index} to {min(end_batch_index, len(deserialized_batches) + delta)} saved to '{chunk_results_file}'.")


if __name__ == "__main__":
    # Configuration
    OPENAI_API_KEY = os.getenv("OPENAI_API_KEY")
    SOURCE_CODE_DIR = "/Users/michaelzhang/Desktop/TAMU/Courses/24fall/689/Project/IoT_Vulnerability/Wyze/wyze-wyze-technology-solutions/sources"

    # Initialize the planner
    planner = CryptoMisusePlanner(openai_api_key=OPENAI_API_KEY, confidence_threshold=0.6)

    # Measure time
    start_time = time.time()

    # Run analysis iteratively
    results_dir = "analysis_results"
    planner.run_analysis(SOURCE_CODE_DIR, batch_size=5, results_dir=results_dir)

    # Measure time
    end_time = time.time()
    elapsed_time = end_time - start_time

    # Print a summary
    print(f"Analysis completed. Results saved in the '{results_dir}' directory.")
    print(f"Total time taken: {elapsed_time:.2f} seconds")


