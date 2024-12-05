from statistics import mean, median, stdev
import os
import numpy as np


def read_vulnerability_data(file_path):
    """
    Reads vulnerability data from a text file.

    Args:
        file_path (str): Path to the text file containing vulnerability data.

    Returns:
        dict: Dictionary where keys are vulnerability types (int) and values are counts (int).
    """
    vulnerability_counts = {}
    with open(file_path, "r", encoding="utf-8") as file:
        for line in file:
            line = line.strip()
            if line.startswith("Type"):
                parts = line.split(":")
                if len(parts) == 2:
                    vuln_type = int(parts[0].replace("Type", "").strip())
                    count = int(parts[1].strip())
                    vulnerability_counts[vuln_type] = count
    return vulnerability_counts


def filter_vulnerabilities(vulnerability_counts):
    """
    Filters out vulnerabilities reported less frequently than the mean threshold.

    Args:
        vulnerability_counts (dict): Dictionary where keys are vulnerability types and values are counts.

    Returns:
        dict: Filtered dictionary with vulnerabilities meeting the threshold.
        float: The calculated threshold value.
    """
    # Calculate the mean value of the counts
    counts = list(vulnerability_counts.values())
    threshold = mean(counts)
    print(f"Threshold (mean value): {threshold:.2f}")

    # Filter vulnerabilities meeting the threshold
    filtered_counts = {vuln: count for vuln, count in vulnerability_counts.items() if count >= threshold}

    return filtered_counts, threshold

def filter_vulnerabilities_median(vulnerability_counts):
    """
    Filters vulnerabilities using the median value as the threshold.
    """
    counts = list(vulnerability_counts.values())
    threshold = median(counts)
    print(f"Threshold (median value): {threshold:.2f}")
    filtered_counts = {vuln: count for vuln, count in vulnerability_counts.items() if count >= threshold}
    return filtered_counts, threshold



def save_filtered_results(filtered_counts, original_file_path):
    """
    Saves the filtered results to a new file in the same directory as the original file.

    Args:
        filtered_counts (dict): Filtered dictionary with vulnerabilities meeting the threshold.
        original_file_path (str): Path to the original file for determining the save directory.
    """
    # Determine the new file path
    directory = os.path.dirname(original_file_path)
    new_file_path = os.path.join(directory, "filtered_vulnerability_count.txt")

    # Save the filtered results
    with open(new_file_path, "w", encoding="utf-8") as f:
        for vuln, count in filtered_counts.items():
            f.write(f"Type {vuln}: {count}\n")

    print(f"Filtered results saved to: {new_file_path}")


def filter_vulnerabilities_std(vulnerability_counts, k=1):
    """
    Filters vulnerabilities using mean ± k × standard deviation as the threshold.

    Args:
        vulnerability_counts (dict): Dictionary of vulnerabilities and their counts.
        k (float): The multiplier for the standard deviation.

    Returns:
        dict: Filtered vulnerabilities.
        tuple: Lower and upper thresholds.
    """
    counts = list(vulnerability_counts.values())
    avg = mean(counts)
    deviation = stdev(counts)
    lower_threshold = avg - k * deviation
    upper_threshold = avg + k * deviation
    print(f"Thresholds (mean ± {k}×stdev): Lower={lower_threshold:.2f}, Upper={upper_threshold:.2f}")

    filtered_counts = {vuln: count for vuln, count in vulnerability_counts.items() if
                       lower_threshold <= count <= upper_threshold}
    return filtered_counts, (lower_threshold, upper_threshold)

def filter_top_n_vulnerabilities(vulnerability_counts, n=5):
    """
    Filters the top-n vulnerabilities based on their counts.

    Args:
        vulnerability_counts (dict): Dictionary of vulnerabilities and their counts.
        n (int): Number of top vulnerabilities to retain.

    Returns:
        dict: Filtered vulnerabilities.
    """
    sorted_vulns = sorted(vulnerability_counts.items(), key=lambda x: x[1], reverse=True)
    filtered_counts = dict(sorted_vulns[:n])
    print(f"Top {n} vulnerabilities retained.")
    return filtered_counts

def filter_vulnerabilities_percentile(vulnerability_counts, percentile=75):
    """
    Filters vulnerabilities using a specific percentile as the threshold.

    Args:
        vulnerability_counts (dict): Dictionary of vulnerabilities and their counts.
        percentile (int): Percentile value to use as a threshold.

    Returns:
        dict: Filtered vulnerabilities.
        float: Calculated percentile value.
    """
    counts = list(vulnerability_counts.values())
    threshold = np.percentile(counts, percentile)
    print(f"Threshold (percentile {percentile}): {threshold:.2f}")
    filtered_counts = {vuln: count for vuln, count in vulnerability_counts.items() if count >= threshold}
    return filtered_counts, threshold

if __name__ == "__main__":
    # File path to the text file containing vulnerability data
    file_path = "Agent_Analysis/multi-agent-v2/Dals-Connect/vulnerability_summary.txt"
    # file_path = "analysis_results/vulnerability_counts.txt"

    # Read the data
    vulnerability_counts = read_vulnerability_data(file_path)

    # Apply the filter
    filtered_counts, threshold = filter_vulnerabilities(vulnerability_counts)

    # Print results
    print("\nFiltered Vulnerabilities (Meeting Threshold):")
    for vuln, count in filtered_counts.items():
        print(f"Type {vuln}: {count}")

    # Save the filtered results
    # save_filtered_results(filtered_counts, file_path)

    # Apply the filter using median
    filtered_counts_median, threshold_median = filter_vulnerabilities_median(vulnerability_counts)
    print("\nFiltered Vulnerabilities (Meeting Median Threshold):")
    for vuln, count in filtered_counts_median.items():
        print(f"Type {vuln}: {count}")

    # Apply the filter using standard deviation
    filtered_counts_std, thresholds_std = filter_vulnerabilities_std(vulnerability_counts, k=1)
    print("\nFiltered Vulnerabilities (Meeting Standard Deviation Threshold):")
    for vuln, count in filtered_counts_std.items():
        print(f"Type {vuln}: {count}")

    # Apply the filter using top-n
    filtered_counts_top_n = filter_top_n_vulnerabilities(vulnerability_counts, n=5)
    print("\nFiltered Top-N Vulnerabilities:")
    for vuln, count in filtered_counts_top_n.items():
        print(f"Type {vuln}: {count}")

    # Apply the filter using percentile
    filtered_counts_percentile, threshold_percentile = filter_vulnerabilities_percentile(vulnerability_counts, percentile=75)
    print("\nFiltered Vulnerabilities (Meeting Percentile Threshold):")
    for vuln, count in filtered_counts_percentile.items():
        print(f"Type {vuln}: {count}")




