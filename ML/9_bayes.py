"""
Naive Bayes is a supervised machine learning algorithm mainly used for classification.

It predicts a class based on the probability of that class given the input features.

Naive Bayes uses Bayes' Theorem to calculate the probability of each possible class.

For example, suppose we want to classify an email as Spam or Not Spam.
- It checks the words present in the email.
- Calculates the probability of Spam and Not Spam.
- Predicts the class with the higher probability.

Why is it called Naive?
It assumes that all input features are independent of each other given the class.

For example, when classifying an email, it treats the presence of the words "offer" and "discount" as independent pieces of evidence, given the email's class.

This assumption is often not completely true, hence the name Naive.

Types of Naive Bayes
Type	                  Used for
Gaussian NB	              Continuous numerical features
Multinomial NB	          Word counts and frequency data
Bernoulli NB	          Binary features (0 or 1)
"""

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
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

# Create Naive Bayes model
model = GaussianNB()

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