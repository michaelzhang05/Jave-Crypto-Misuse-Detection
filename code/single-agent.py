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

class CryptoMisuseAgent:
    def __init__(self, openai_api_key, max_tokens_per_batch=15000, batch_file="batched_input.json"):
        self.openai_api_key = openai_api_key
        self.max_tokens_per_batch = max_tokens_per_batch
        self.batch_file = batch_file
        self.llm = ChatOpenAI(model="gpt-4o-mini", temperature=0, openai_api_key=openai_api_key)

    def analyze_batch(self, batch, batch_id=None):
        """
        Analyze a batch of Java files using the GPT-4 LLM to find crypto misuse vulnerabilities.
        """
        # Define a focused prompt template
        template = """
        You are a cybersecurity expert specializing in cryptographic API misuse detection.
        Analyze the following Java code and determine if it has any of the following 10 vulnerabilities:
        
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
        
        If the code is vulnerable, respond with:
        "Vulnerable"
        Followed by the vulnerabilities you found in the code, listed by their numbers (e.g., 1, 3, 7).
        For each vulnerability, include the corresponding code snippet to verify your results.
        Do not provide any explanation or additional context.

        If the code is not vulnerable, respond with:
        "None Vulnerability Found"
        
        Do not include any additional context in your response. Keep your response simplified and to the point.

        Here are two examples of how to respond:

        Example 1 (Vulnerable Code):
        Vulnerable
        1, 5, 9
        1: AES encryption code snippet here...
        5: MD5 hashing code snippet here...
        9: SSL context code snippet here...

        Example 2 (No Vulnerabilities):
        None Vulnerability Found

        Now analyze the following file:

        Code:
        {code}

        Your response:
        """
        prompt = PromptTemplate(input_variables=["code"], template=template)

        # Results storage
        results = []

        # Analyze each document in the batch
        for i, doc in enumerate(batch):
            query = prompt.format(code=doc.page_content)
            # if the query is too long, skip it
            if self.count_tokens(query) > 128000:
                print(f"Skipping document {i} in batch {batch_id} due to excessive token count.")
                continue
            result = self.llm.predict(query)
            results.append({"Batch ID:": batch_id, "Document ID": i, "response": result})

        return results



    def count_tokens(self, text, model="gpt-4o-mini"):
        """
        Count the number of tokens in the given text.
        """
        tokenizer = tiktoken.encoding_for_model(model)
        return len(tokenizer.encode(text))
    

    def run_analysis(self, source_code_dir, batch_size=10, results_dir="analysis_results"):
        """
        Run the analysis pipeline iteratively: process batches in chunks and save results for each iteration separately.
        """
        # Step 1: Check if batched input exists
        if os.path.exists(self.batch_file):
            print(f"Loading existing batches from {self.batch_file}...")
            with open(self.batch_file, "r", encoding="utf-8") as f:
                serialized_batches = json.load(f)
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

        # deserialized_batches = deserialized_batches[:100]  # For testing purposes
        # process all the reamining batches
        # deserialized_batches = deserialized_batches[370:]

        # Ensure results directory exists
        os.makedirs(results_dir, exist_ok=True)

        # Step 3: Iteratively analyze batches
        for i in range(0, len(deserialized_batches), batch_size):
            # skip the 380 batch
            # if i == 10:
            #     continue
            print(f"Processing batches {i + 1} to {min(i + batch_size, len(deserialized_batches))}...")
            batch_chunk = deserialized_batches[i:i + batch_size]
            
            all_results = []
            for j, batch in enumerate(batch_chunk):
                print(f"Analyzing batch {i + j + 1} of {len(deserialized_batches)}...")
                batch_results = self.analyze_batch(batch, i + j)
                all_results.extend(batch_results)

            # Save results for the current chunk
            chunk_results_file = os.path.join(results_dir, f"results_batch_{i}_to_{i + batch_size}.json")
            with open(chunk_results_file, "w", encoding="utf-8") as f:
                json.dump(all_results, f, indent=4)
            print(f"Results for batches {i} to {i + batch_size} saved to '{chunk_results_file}'.")


def calculate_openai_cost(token_count, model="gpt-4o-mini"):
    """
    Calculate the cost of using the OpenAI API based on the token count and model.
    Adjust the pricing based on OpenAI's pricing model.
    """
    # Pricing in USD per 1,000 tokens (adjust based on actual OpenAI pricing)
    PRICING = {
        "gpt-4": 0.03,  # Example cost per 1,000 tokens
        "gpt-4-32k": 0.06,
        "gpt-4o-mini": 0.0006
    }
    cost_per_1k_tokens = PRICING.get(model, 0.03)
    return (token_count / 1000) * cost_per_1k_tokens


# Example usage
if __name__ == "__main__":
    # Configuration
    OPENAI_API_KEY = os.getenv("OPENAI_API_KEY")
    SOURCE_CODE_DIR = "/Users/michaelzhang/Desktop/TAMU/Courses/24fall/689/Project/IoT_Vulnerability/Wyze/wyze-wyze-technology-solutions/sources"

    MODEL = "gpt-40-mini"

    # Initialize the agent
    agent = CryptoMisuseAgent(openai_api_key=OPENAI_API_KEY)

    # Measure time
    start_time = time.time()

    # Run analysis iteratively
    results_dir = "analysis_results"
    results = agent.run_analysis(SOURCE_CODE_DIR, batch_size=10, results_dir=results_dir)

    # Measure time
    end_time = time.time()
    elapsed_time = end_time - start_time

    # Calculate API cost
    # total_tokens = sum(result["response"]["total_tokens"] for result in results if "response" in result)
    # total_cost = calculate_openai_cost(total_tokens, model=MODEL)

    # Save final report
    # with open("final_report.json", "w", encoding="utf-8") as f:
    #     json.dump({
    #         "total_time_seconds": elapsed_time,
    #         "total_cost_usd": total_cost,
    #         "results": results
    #     }, f, indent=4)

    # Print a summary
    print(f"Analysis completed. Results saved in the '{results_dir}' directory.")
    print(f"Total time taken: {elapsed_time:.2f} seconds")
    # print(f"Total cost of OpenAI API usage: ${total_cost:.2f}")
