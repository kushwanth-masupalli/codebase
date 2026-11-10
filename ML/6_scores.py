"""
in this file we will get know what kind of scores we most use in evaluating machine learning models

Regression metrics :

1) Mean Absolute error = sum of the absolute values of predicted values and actual values
2) Mean Squared error = sum of the squared values of predicted values and actual values
3) Root mean squared error = root of the mse

4) R2 = tells us how much of the variation in the target variable is explained by our model
Higher R2 is generally better
R2 = 1       -> Perfect predictions
R2 = 0       -> No improvement over predicting the mean
R2 < 0       -> Worse than predicting the mean



Classification Metrics :

1) accuracy = how many predictions were correct out of all predictions
higher accuracy is generally better

Important:
Accuracy can be misleading when the dataset is imbalanced.
Example:
100 transactions:
95 are legitimate
5 are fraudulent

If our model predicts every transaction as legitimate,
accuracy will be 95%, but it detects ZERO fraud cases!

2) Confusion matrix = tells us how many predictions were correct and incorrect

it contains 4 important values
TP (true positive) model predicted positive that are actually positive
TN( true negative) model predicted negative that are actually negative
FP( false positive) model predicted positive that are actually negative
FN( false negative) model predicted negative that are actually negative

3) Precision = out of all positive predictions that our model made how many are actual positives
Higher precision means fewer false positives.
Use case:
When false alarms are costly.


4) Recall= out of all actual positive predictions that our model made how many are actually positive

Higher recall means fewer false negatives.

Use case:
Disease detection and fraud detection,
where missing a positive case can be costly.


5) F1 score

is the harmonic mean of precision and recall

Higher F1 score means a better balance between
Precision and Recall.

Use case:
When both false positives and false negatives matter.


6. ROC-AUC SCORE

ROC = Receiver Operating Characteristic.

AUC = Area Under the Curve.

ROC-AUC measures how well a model can distinguish
between positive and negative classes across different
classification thresholds.

AUC = 1.0  -> Perfect classification
AUC = 0.5  -> Random guessing
AUC < 0.5  -> Worse than random ranking

Higher AUC is generally better.

"""