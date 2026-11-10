"""
Random Forest is a supervised Machine Learning algorithm used for both
classification and regression.
combines multiple Decision Trees to make a more reliable prediction.

Why do we need Random Forest?
A single Decision Tree can overfit the training data.

For example, one Decision Tree might learn the training data too closely and make poor predictions on new data.

Random Forest solves this by creating multiple Decision Trees and combining their predictions.

how does a random forest work?

Randomly selects different samples from the training dataset.
Builds multiple Decision Trees using those samples.
Each tree makes its own prediction.
Combines the predictions to get the final result.

For classification: Uses majority voting.
For regression: Takes the average of predictions.
"""

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import (
    accuracy_score,
    confusion_matrix,
    classification_report
)

# Load dataset
df = pd.read_csv("wine.csv", sep=";")

# Features
X = df[
    [
        "alcohol",
        "volatile acidity",
        "citric acid",
        "sulphates"
    ]
]

# Target: Good wine = 1, Not Good wine = 0
y = (df["quality"] >= 7).astype(int)

# Split dataset
X_train, X_test, y_train, y_test = train_test_split(
    X, y,
    test_size=0.2,
    random_state=42,
    stratify=y
)

# Create Random Forest model
model = RandomForestClassifier(
    n_estimators=100,
    max_depth=5,
    random_state=42
)

# Train model
model.fit(X_train, y_train)

# Predictions
y_pred = model.predict(X_test)

# Evaluation
print("Accuracy:", accuracy_score(y_test, y_pred))

print("Confusion Matrix:")
print(confusion_matrix(y_test, y_pred))

print("Classification Report:")
print(classification_report(y_test, y_pred))

"""
Parameter	Meaning
n_estimators	Number of Decision Trees
max_depth	Maximum depth of each tree
min_samples_split	Minimum samples required to split a node
min_samples_leaf	Minimum samples required in a leaf
random_state	Makes results reproducible


Remember:
- More trees can improve stability, but increase training and prediction time.
- Random Forest generally does not require feature scaling.
- It reduces overfitting compared with a single Decision Tree, but does not guarantee that overfitting won't happen.
"""