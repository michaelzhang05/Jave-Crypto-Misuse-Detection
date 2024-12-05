import os
from langchain.schema import Document
import tiktoken

def collect_java_files(root_dir):
    """
    Recursively collect all .java files from the directory structure.
    """
    java_files = []
    for dirpath, _, filenames in os.walk(root_dir):
        for file in filenames:
            if file.endswith(".java"):
                java_files.append(os.path.join(dirpath, file))
    return java_files

def prioritize_files(java_files):
    """
    Prioritize files based on cryptographic-related keywords.
    """
    crypto_keywords = ["Cipher", "Key", "Signature", "javax.crypto", "java.security"]
    prioritized_files = []

    for file in java_files:
        try:
            with open(file, "r", encoding="utf-8") as f:
                content = f.read()
                if any(keyword in content for keyword in crypto_keywords):
                    prioritized_files.append(file)
        except Exception as e:
            print(f"Error reading file {file}: {e}")
    
    return prioritized_files

def preprocess_files(java_files, max_tokens_per_batch, model="gpt-4o-mini"):
    """
    Preprocess files to create Document objects, and split them into manageable batches.
    """
    import tiktoken
    tokenizer = tiktoken.encoding_for_model(model)

    documents = []
    for file in java_files:
        try:
            with open(file, "r", encoding="utf-8") as f:
                content = f.read()
                document = Document(
                    page_content=content,
                    metadata={"file_path": file}
                )
                documents.append(document)
        except Exception as e:
            print(f"Error processing file {file}: {e}")

    # Batch documents
    batches = []
    current_batch = []
    current_batch_tokens = 0

    for doc in documents:
        doc_tokens = len(tokenizer.encode(doc.page_content))
        if current_batch_tokens + doc_tokens > max_tokens_per_batch:
            batches.append(current_batch)
            current_batch = []
            current_batch_tokens = 0
        current_batch.append(doc)
        current_batch_tokens += doc_tokens
    
    if current_batch:
        batches.append(current_batch)

    return batches

# Example usage
if __name__ == "__main__":
    SOURCE_CODE_DIR = "/Users/michaelzhang/Desktop/TAMU/Courses/24fall/689/Project/IoT_Vulnerability/Tuya/sources"
    MAX_TOKENS_PER_BATCH = 15000  # Adjust as needed

    # Step 1: Collect all Java files
    all_java_files = collect_java_files(SOURCE_CODE_DIR)
    # print the number of java files
    # print(f"Number of .java files: {len(all_java_files)}")

    # Step 2: Prioritize files with cryptographic relevance
    prioritized_files = prioritize_files(all_java_files)
    # print the number of prioritized files
    # print(f"Number of prioritized files: {len(prioritized_files)}")

    # Step 3: Preprocess and batch files
    batches = preprocess_files(prioritized_files, MAX_TOKENS_PER_BATCH)
    # print the number of batches
    # print(f"Number of batches: {len(batches)}")

    # Step 4: Debug output
    print(f"Total files: {len(all_java_files)}")
    print(f"Prioritized files: {len(prioritized_files)}")
    print(f"Total batches: {len(batches)}")

    # For the first batch, print the number of documents and total tokens
    if batches:
        first_batch = batches[0]
        print(f"First batch: {len(first_batch)} documents, {sum(len(tiktoken.encoding_for_model('gpt-4').encode(doc.page_content)) for doc in first_batch)} tokens")
        # print the document path in the first batch
        for doc in first_batch:
            print(doc.metadata["file_path"])
