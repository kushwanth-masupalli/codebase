"""
SVM is a supervised Machine Learning algorithm used for both
classification and regression.

It tries to find the best decision boundary
(called a hyperplane) that separates different classes.

ow does SVM work?
Imagine we have two types of data points: Good wine
 and Not Good wine.

SVM tries to draw a boundary that separates these two
classes while keeping the maximum possible distance from
the nearest points of both classes.


Important terms:
- Hyperplane: The decision boundary that separates classes.
- Margin: The distance between the decision boundary
 and the nearest data points.
- Support Vectors: The data points closest to the
 boundary. They help determine the position of the
 hyperplane.

 Why is maximum margin important?
SVM tries to maximize the margin between the two classes.

A larger margin can help the model generalize better to unseen data.

What if data is not linearly separable?
Sometimes we cannot separate data using a straight line.

SVM handles this using the Kernel Trick.

Common kernels:
Kernel	Purpose
Linear	Separates data using a straight boundary
Polynomial	Creates curved decision boundaries
RBF	Handles complex nonlinear boundaries
Sigmoid	Uses a sigmoid-based kernel



"""

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.svm import SVC
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

# Feature scaling
scaler = StandardScaler()

X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)

# Create SVM model
model = SVC(
    kernel="rbf",
    C=1.0,
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
kernel	Defines the type of decision boundary
C	Controls the penalty for misclassification
gamma	Controls how far the influence of a training point reaches (RBF, polynomial, sigmoid)
degree	Degree of the polynomial kernel


Understanding C:
- High C: Tries harder to classify training points correctly; can overfit.
- Low C: Allows more training errors; creates stronger regularization.

"""