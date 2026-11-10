
"""
LOGISTIC REGRESSION

Logistic Regression is a supervised machine learning algorithm
used for classification, where the output is a category rather
than a continuous numerical value.

Examples:
- Spam or Not Spam
- Fraud or Not Fraud
- Good Wine or Not Good Wine

Logistic Regression calculates a probability between 0 and 1
using the Sigmoid function.

For example:
- Probability = 0.85 -> Class 1
- Probability = 0.20 -> Class 0

Default threshold = 0.5:
- Probability >= 0.5 -> Class 1
- Probability < 0.5  -> Class 0


IMPLEMENTATION USING wine.csv

Our goal:
Predict whether wine is Good (1) or Not Good (0).

For this exercise:
- Quality >= 7 -> Good (1)
- Quality < 7  -> Not Good (0)
"""

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import (
    accuracy_score,
    confusion_matrix,
    classification_report
)


df = pd.read_csv("wine.csv", sep=";")

X = df[["alcohol", "volatile acidity", "citric acid", "sulphates"]]

y = (df["quality"] >= 7).astype(int)

# random_state=42 -> Same random split every time.
# stratify=y -> Maintains the same proportion of Good and


X_train, X_test, y_train, y_test = train_test_split(
    X, y,
    test_size=0.2,
    random_state=42,
    stratify=y
)

# 5. Feature Scaling using StandardScaler
#
# WHY SCALING?
# Different features have different numerical ranges.
# Example:
# alcohol = 12
# density = 0.99
#
# Features with larger numerical values can influence
# Logistic Regression disproportionately.
#
# StandardScaler converts features to a common scale:
# Mean = 0
# Standard Deviation = 1
#
# Formula:
# z = (x - mean) / standard_deviation

scaler = StandardScaler()

# fit_transform():
# 1. fit() -> Learns and remembers the MEAN and SD
#             of every feature from training data.
# 2. transform() -> Scales training data using those values.
X_train = scaler.fit_transform(X_train)

# transform():
# Uses the SAME mean and SD learned from training data.
#
# WHY NOT fit_transform() HERE?
# We must not learn scaling statistics from test data.
# Doing so would cause DATA LEAKAGE.
#
# Test data must remain unseen during training.
X_test = scaler.transform(X_test)

model = LogisticRegression()

model.fit(X_train, y_train)

y_pred = model.predict(X_test)



# Accuracy: Overall percentage of correct predictions.
print("Accuracy:", accuracy_score(y_test, y_pred))

# Confusion Matrix: Shows correct and incorrect predictions.
print("Confusion Matrix:\n", confusion_matrix(y_test, y_pred))

# Classification Report:
# Precision -> How many predicted positives were actually positive?
# Recall    -> How many actual positives did the model identify?
# F1-score  -> Harmonic mean of precision and recall.
print("Classification Report:\n", classification_report(y_test, y_pred))
