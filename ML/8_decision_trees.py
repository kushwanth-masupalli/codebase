"""
A decision tree is a supervised learning algorithm used for
both classification and regression tasks. it has a
hierarchical tree structure which consists of a root node
branches , internal nodes and leaf nodes. it works like
a flow chart that helps in making step by step decisions,
where

internal node represents attribute tests
branches represent attribute values
leaf node represents final decisions or predictions

Decision trees are widely used due to their interpretability,
 flexibility and low preprocessing needs.

 How does a Decision Tree decide which question to ask?
It tries to select the feature and threshold that best separate the classes.

Two commonly used methods:
- Gini Impurity: Measures how mixed the classes are in a node. Lower Gini means better separation.
- Entropy: Measures the impurity or uncertainty in a node. Lower entropy means better separation.

"""

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report

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

# Target
y = (df["quality"] >= 7).astype(int)

# Split dataset
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42, stratify=y
)

# Create Decision Tree model
model = DecisionTreeClassifier(
    criterion="gini",
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