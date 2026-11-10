"""
KNN is a supervised machine learning algorithm used for both classification and regression

it predicts the output of a new data by looking at the k nearest neighbors in the training dataset .

how does knn works?

calculates the distance between new points and training data points .
find the k nearest neighbors
check their classes
assigns the majority class to the new data point .

k is the number of nearest neighbors considered while making a prediction .

knn is distance based so scaling is important.

"""
import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import KNeighborsClassifier
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

# Feature scaling
scaler = StandardScaler()

X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)

# Create KNN model
model = KNeighborsClassifier(n_neighbors=5)

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