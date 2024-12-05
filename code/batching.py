from dataset_parser import DatasetParser
import tiktoken

def create_batches(documents, max_tokens_per_batch, model="gpt-4"):
    """
    Splits documents into batches such that each batch stays within a specified token limit.
    
    Parameters:
        documents (list): A list of Document objects.
        max_tokens_per_batch (int): Maximum token limit per batch.
        model (str): Model to determine the tokenizer (default: "gpt-4").
    
    Returns:
        list of list: Batches of Document objects.
    """
    
    # Get the tokenizer for the specified model
    tokenizer = tiktoken.encoding_for_model(model)

    batches = []
    current_batch = []
    current_batch_token_count = 0

    for doc in documents:
        doc_token_count = len(tokenizer.encode(doc.page_content))
        
        # Check if adding this document would exceed the batch limit
        if current_batch_token_count + doc_token_count > max_tokens_per_batch:
            # Finalize the current batch
            batches.append(current_batch)
            current_batch = []
            current_batch_token_count = 0
        
        # Add the document to the current batch
        current_batch.append(doc)
        current_batch_token_count += doc_token_count

    # Add any remaining documents as the final batch
    if current_batch:
        batches.append(current_batch)
    
    return batches

# Example: Assuming documents from the DatasetParser
DATASET_PATH = "../dataset/CryptoAPI-Bench/src/main/java/org/cryptoapi/bench"
LABELS_EXCEL_PATH = "../dataset/CryptoAPI-Bench/CryptoAPI-Bench_details.xlsx"

parser = DatasetParser(dataset_path=DATASET_PATH, labels_excel_path=LABELS_EXCEL_PATH)
documents = parser.generate_documents()
# Example usage
MAX_TOKENS_PER_BATCH = 15000  # Adjust based on your needs and GPT-4 model limit
batches = create_batches(documents, MAX_TOKENS_PER_BATCH)

# Print batch details for debugging
for i, batch in enumerate(batches):
    batch_token_count = sum(len(tiktoken.encoding_for_model("gpt-4").encode(doc.page_content)) for doc in batch)
    print(f"Batch {i + 1}: {len(batch)} documents, {batch_token_count} tokens")
