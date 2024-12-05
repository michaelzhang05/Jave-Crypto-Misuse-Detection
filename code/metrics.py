from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score, roc_curve, auc
import matplotlib.pyplot as plt
import numpy as np

def calculate_metrics(labels, predictions):
    """
    Calculate accuracy, precision, recall, and F1-score.
    """
    print("Calculating metrics...")
    accuracy = accuracy_score(labels, predictions)
    precision = precision_score(labels, predictions, average='weighted', zero_division=0)
    recall = recall_score(labels, predictions, average='weighted', zero_division=0)
    f1 = f1_score(labels, predictions, average='weighted', zero_division=0)

    return {
        "accuracy": accuracy,
        "precision": precision,
        "recall": recall,
        "f1": f1
    }

def calculate_fpr_fnr(labels, predictions_probs, threshold=0.5):
    """
    Calculate False Positive Rate (FPR) and False Negative Rate (FNR).
    """
    print("Calculating FPR and FNR...")
    predictions = (np.array(predictions_probs) >= threshold).astype(int)
    TP = np.sum((labels == 1) & (predictions == 1))
    FP = np.sum((labels == 0) & (predictions == 1))
    FN = np.sum((labels == 1) & (predictions == 0))
    TN = np.sum((labels == 0) & (predictions == 0))

    FPR = FP / (FP + TN) if (FP + TN) > 0 else 0
    FNR = FN / (FN + TP) if (FN + TP) > 0 else 0
    return FPR, FNR

def plot_roc_curve(labels, predictions_probs, title):
    """
    Plot the ROC curve and calculate the AUC.
    """
    print("Plotting ROC curve...")
    fpr, tpr, _ = roc_curve(labels, predictions_probs)
    roc_auc = auc(fpr, tpr)

    plt.figure()
    plt.plot(fpr, tpr, color='blue', lw=2, label=f'ROC curve (AUC = {roc_auc:.2f})')
    plt.plot([0, 1], [0, 1], color='gray', linestyle='--')  # Random guessing line
    plt.xlim([0.0, 1.0])
    plt.ylim([0.0, 1.05])
    plt.xlabel('False Positive Rate (FPR)')
    plt.ylabel('True Positive Rate (TPR)')
    plt.title(title)
    plt.legend(loc="lower right")
    plt.grid(alpha=0.3)
    plt.show()

if __name__ == "__main__":
    # Ground truth and predictions
    print("Starting metrics calculation...")
    labels = np.array([1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
                       0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
                       0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0,
                       0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0,
                       0, 0, 1, 0, 1, 1, 1, 1, 0, 1])
    predictions = np.array([0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
                             0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
                             0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0,
                             0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
                             0, 0, 1, 0, 1, 1, 0, 0, 1, 0])

    predictions_raw = np.array([1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                             1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                             1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                             1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                             1, 1, 1, 0, 1, 1, 1, 1, 1, 1])

    predictions_multi = np.array([1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0,
                             0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0,
                             0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0,
                             0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0,
                             1, 0, 1, 0, 0, 1, 1, 1, 1, 1])

    predictions_multi_raw = np.array([0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
                                0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
                                0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
                                0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
                                0, 1, 0, 1, 1, 1, 1, 1, 0, 0,])

    # labels_partial = np.array([0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0])
    # predictions_partial = np.array([0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0])
    # predictions_partial_one_shot = np.array([1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1])

    # labels_partial = np.array([1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
    #                    0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
    #                    0, 1, 1, 0, 1, 1, 1, 1, 0, 0,
    #                    0, 1, 1, 0, 0, 0, 1, 1, 1, 0,
    #                    0, 0, 1, 0, 1, 1, 1, 1, 0, 1])
    #
    # predictions_partial_single = np.array([1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    #                             1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    #                             1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    #                             1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    #                             1, 1, 1, 0, 1, 1, 1, 1, 1, 1])
    #
    # predictions_partial_multi = np.array([0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
    #                             0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
    #                             0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
    #                             0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
    #                             0, 1, 0, 1, 1, 1, 1, 1, 0, 0,])

    # For each 10 elements in labels, get the number 2,5,6,7,8 elements, and put it in labels_5
    # labels_5 = []
    # for i in range(0, len(labels), 10):
    #     print(labels[i+1], labels[i+4], labels[i+5], labels[i+6], labels[i+7])
    #     labels_5.append(labels[i+1])
    #     labels_5.append(labels[i+4])
    #     labels_5.append(labels[i+5])
    #     labels_5.append(labels[i+6])
    #     labels_5.append(labels[i+7])
    # labels_5 = np.array(labels_5)
    #
    # # For each 10 elements in predictions_raw, get the number 2,5,6,7,8 elements, and put it in predictions_5
    # predictions_raw_5 = []
    # for i in range(0, len(predictions_raw), 10):
    #     print(predictions_raw[i+1], predictions_raw[i+4], predictions_raw[i+5], predictions_raw[i+6], predictions_raw[i+7])
    #     predictions_raw_5.append(predictions_raw[i+1])
    #     predictions_raw_5.append(predictions_raw[i+4])
    #     predictions_raw_5.append(predictions_raw[i+5])
    #     predictions_raw_5.append(predictions_raw[i+6])
    #     predictions_raw_5.append(predictions_raw[i+7])
    #
    # predictions_raw_5 = np.array(predictions_raw_5)
    #
    # # calculate metrics for 5 elements
    # metrics_5 = calculate_metrics(labels_5, predictions_raw_5)
    # print("Metrics for 5 elements:")
    # for metric, value in metrics_5.items():
    #     print(f"{metric.capitalize()}: {value:.2f}")
    #
    # # Calculate FPR and FNR for 5 elements
    # fpr_5, fnr_5 = calculate_fpr_fnr(labels_5, predictions_raw_5, threshold=0.5)
    # print(f"FPR for 5 elements: {fpr_5:.2f}, FNR for 5 elements: {fnr_5:.2f}")
    #
    # # Plot ROC curve for 5 elements
    # plot_roc_curve(labels_5, predictions_raw_5)


    # labels_partial_5 = []
    # for i in range(0, len(labels_partial), 10):
    #     # print(labels[i+1], labels[i+4], labels[i+5], labels[i+6], labels[i+7])
    #     labels_partial_5.append(labels_partial[i+1])
    #     labels_partial_5.append(labels_partial[i+4])
    #     labels_partial_5.append(labels_partial[i+5])
    #     labels_partial_5.append(labels_partial[i+6])
    #     labels_partial_5.append(labels_partial[i+7])
    # labels_partial_5 = np.array(labels_partial_5)
    #
    # # For each 10 elements in predictions_raw, get the number 2,5,6,7,8 elements, and put it in predictions_5
    # predictions_partial_5 = []
    # for i in range(0, len(predictions_partial), 10):
    #     # print(predictions_raw[i+1], predictions_raw[i+4], predictions_raw[i+5], predictions_raw[i+6], predictions_raw[i+7])
    #     predictions_partial_5.append(predictions_partial[i+1])
    #     predictions_partial_5.append(predictions_partial[i+4])
    #     predictions_partial_5.append(predictions_partial[i+5])
    #     predictions_partial_5.append(predictions_partial[i+6])
    #     predictions_partial_5.append(predictions_partial[i+7])
    # predictions_partial_5 = np.array(predictions_partial_5)
    #
    # predictions_partial_one_shot_5 = []
    # for i in range(0, len(predictions_partial_one_shot), 10):
    #     # print(predictions_raw[i+1], predictions_raw[i+4], predictions_raw[i+5], predictions_raw[i+6], predictions_raw[i+7])
    #     predictions_partial_one_shot_5.append(predictions_partial_one_shot[i+1])
    #     predictions_partial_one_shot_5.append(predictions_partial_one_shot[i+4])
    #     predictions_partial_one_shot_5.append(predictions_partial_one_shot[i+5])
    #     predictions_partial_one_shot_5.append(predictions_partial_one_shot[i+6])
    #     predictions_partial_one_shot_5.append(predictions_partial_one_shot[i+7])
    # predictions_partial_one_shot_5 = np.array(predictions_partial_one_shot_5)
    #
    # # calculate metrics for 5 elements
    # metrics_5 = calculate_metrics(labels_partial_5, predictions_partial_one_shot_5)
    # print("Metrics for 5 elements:")
    # for metric, value in metrics_5.items():
    #     print(f"{metric.capitalize()}: {value:.2f}")
    #
    # # Calculate FPR and FNR for 5 elements
    # fpr_5, fnr_5 = calculate_fpr_fnr(labels_partial_5, predictions_partial_one_shot_5, threshold=0.5)
    # print(f"FPR for 5 elements: {fpr_5:.2f}, FNR for 5 elements: {fnr_5:.2f}")
    #
    # # Plot ROC curve for 5 elements
    # plot_roc_curve(labels_partial_5, predictions_partial_one_shot_5)




    # print(f"Length of labels: {len(labels)}")
    # # print(f"Length of predictions: {len(predictions)}")
    # print(f"Length of predictions_raw: {len(predictions_raw)}")
    #
    print("------ Metrics for one-shot predictions after post processing ------")
    # Calculate metrics
    metrics = calculate_metrics(labels, predictions)
    # metrics = calculate_metrics(labels, predictions_raw)
    print("Metrics:")
    for metric, value in metrics.items():
        print(f"{metric.capitalize()}: {value:.2f}")

    # Calculate FPR and FNR
    fpr, fnr = calculate_fpr_fnr(labels, predictions, threshold=0.5)
    # fpr, fnr = calculate_fpr_fnr(labels, predictions_raw, threshold=0.5)
    print(f"FPR: {fpr:.2f}, FNR: {fnr:.2f}")

    # Plot ROC curve
    plot_roc_curve(labels, predictions, "ROC curve for one-shot predictions after post processing")
    # plot_roc_curve(labels, predictions_raw)


    print("------ Metrics for multi-shot predictions after post processing ------")
    # Calculate metrics for multi-shot predictions
    metrics_multi = calculate_metrics(labels, predictions_multi)
    print("Metrics for multi-shot predictions:")
    for metric, value in metrics_multi.items():
        print(f"{metric.capitalize()}: {value:.2f}")

    # Calculate FPR and FNR for multi-shot predictions
    fpr_multi, fnr_multi = calculate_fpr_fnr(labels, predictions_multi, threshold=0.5)
    print(f"FPR for multi-shot predictions: {fpr_multi:.2f}, FNR for multi-shot predictions: {fnr_multi:.2f}")

    # Plot ROC curve for multi-shot predictions
    plot_roc_curve(labels, predictions_multi, "ROC curve for multi-shot predictions after post processing")





    ####### USE RAW DATA ######
    print("------ Metrics for one-shot predictions using raw data ------")
    # Calculate metrics
    # metrics = calculate_metrics(labels, predictions)
    metrics = calculate_metrics(labels, predictions_raw)
    print("Metrics:")
    for metric, value in metrics.items():
        print(f"{metric.capitalize()}: {value:.2f}")

    # Calculate FPR and FNR
    # fpr, fnr = calculate_fpr_fnr(labels, predictions, threshold=0.5)
    fpr, fnr = calculate_fpr_fnr(labels, predictions_raw, threshold=0.5)
    print(f"FPR: {fpr:.2f}, FNR: {fnr:.2f}")

    # Plot ROC curve
    # plot_roc_curve(labels, predictions)
    plot_roc_curve(labels, predictions_raw, "ROC curve for one-shot predictions using raw data")

    print("------ Metrics for multi-shot predictions using raw data ------")
    # Calculate metrics for multi-shot predictions
    metrics_multi = calculate_metrics(labels, predictions_multi_raw)
    print("Metrics for multi-shot predictions:")
    for metric, value in metrics_multi.items():
        print(f"{metric.capitalize()}: {value:.2f}")

    # Calculate FPR and FNR for multi-shot predictions
    fpr_multi, fnr_multi = calculate_fpr_fnr(labels, predictions_multi_raw, threshold=0.5)
    print(f"FPR for multi-shot predictions: {fpr_multi:.2f}, FNR for multi-shot predictions: {fnr_multi:.2f}")

    # Plot ROC curve for multi-shot predictions
    plot_roc_curve(labels, predictions_multi_raw, "ROC curve for multi-shot predictions using raw data")


    # # Calculate metrics for partial data
    # metrics_partial = calculate_metrics(labels_partial, predictions_partial)
    # print("Metrics for partial data:")
    # for metric, value in metrics_partial.items():
    #     print(f"{metric.capitalize()}: {value:.2f}")
    #
    # # Calculate FPR and FNR for partial data
    # fpr_partial, fnr_partial = calculate_fpr_fnr(labels_partial, predictions_partial, threshold=0.5)
    # print(f"FPR for partial data: {fpr_partial:.2f}, FNR for partial data: {fnr_partial:.2f}")
    #
    # # Plot ROC curve for partial data
    # plot_roc_curve(labels_partial, predictions_partial)


    #################### Reduce FPR ########################
    # Calculate metrics for partial data with one-shot predictions
    # metrics_partial_one_shot = calculate_metrics(labels_partial, predictions_partial_single)
    # print("Metrics for partial data with one-shot predictions:")
    # for metric, value in metrics_partial_one_shot.items():
    #     print(f"{metric.capitalize()}: {value:.2f}")
    #
    # # Calculate FPR and FNR for partial data with one-shot predictions
    # fpr_partial_one_shot, fnr_partial_one_shot = calculate_fpr_fnr(labels_partial, predictions_partial_single, threshold=0.5)
    # print(f"FPR for partial data with one-shot predictions: {fpr_partial_one_shot:.2f}, FNR for partial data with one-shot predictions: {fnr_partial_one_shot:.2f}")
    #
    # # Plot ROC curve for partial data with one-shot predictions
    # plot_roc_curve(labels_partial, predictions_partial_single)
    #
    # # Calculate metrics for partial data with multi-shot predictions
    # metrics_partial_multi = calculate_metrics(labels_partial, predictions_partial_multi)
    # print("Metrics for partial data with multi-shot predictions:")
    # for metric, value in metrics_partial_multi.items():
    #     print(f"{metric.capitalize()}: {value:.2f}")
    #
    # # Calculate FPR and FNR for partial data with multi-shot predictions
    # fpr_partial_multi, fnr_partial_multi = calculate_fpr_fnr(labels_partial, predictions_partial_multi, threshold=0.5)
    # print(f"FPR for partial data with multi-shot predictions: {fpr_partial_multi:.2f}, FNR for partial data with multi-shot predictions: {fnr_partial_multi:.2f}")
    #
    # # Plot ROC curve for partial data with multi-shot predictions
    # plot_roc_curve(labels_partial, predictions_partial_multi)