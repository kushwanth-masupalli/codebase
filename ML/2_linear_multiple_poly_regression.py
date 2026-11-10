"""
LINEAR REGRESSION

Linear Regression:
- A supervised learning model used to predict a continuous numerical value.
- The model finds the best-fitting straight line so predictions are
  as close as possible to actual values.

X = Independent variable (input/features)
Y = Dependent variable (output/target)

Simple Linear Regression:
- Uses one feature to predict the target.

Multiple Linear Regression:
- Uses multiple features to predict the target.

Polynomial Regression:
- Uses polynomial features to model a curved relationship
  instead of just a straight line.

BEST-FIT LINE

y = mx + c

m = Coefficient (slope) of the regression line.
c = Intercept of the regression line.

RESIDUAL
- Difference between actual and predicted values.
- Can be positive or negative.

Residual = Actual Value - Predicted Value

MEAN SQUARED ERROR (MSE)
- Average of the squared prediction errors.
- Penalizes larger errors more heavily.
- Lower MSE generally indicates better predictions.

R2 SCORE
- Measures how well the model explains variation in the target.
- A score closer to 1 generally indicates a better fit.
- Negative R2 means the model performs worse than predicting the mean.

OVERFITTING
- When a model performs very well on training data
  but poorly on unseen data.

FINAL UNDERSTANDING
- Linear Regression finds coefficients and intercept that minimize
  the sum of squared residuals (equivalent to minimizing MSE).
"""

import pandas as pd
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import PolynomialFeatures
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score


# ==========================================
# LOAD DATASET
# ==========================================

df = pd.read_csv("wine.csv", sep=";")


# ==========================================
# 1. MULTIPLE LINEAR REGRESSION
# ==========================================

X = df[
    [
        "alcohol",
        "volatile acidity",
        "citric acid",
        "residual sugar",
        "density",
        "pH",
        "sulphates"
    ]
]

y = df["quality"]

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

model = LinearRegression()

model.fit(X_train, y_train)

y_pred = model.predict(X_test)

print("\n========== MULTIPLE LINEAR REGRESSION ==========")

print("Actual values:")
print(y_test.head(10).values)

print("Predicted values:")
print(y_pred[:10])

print("MAE:", mean_absolute_error(y_test, y_pred))
print("MSE:", mean_squared_error(y_test, y_pred))
print("R2 Score:", r2_score(y_test, y_pred))


# ==========================================
# 2. POLYNOMIAL REGRESSION
# ==========================================

# Using alcohol as the single input feature

X = df[["alcohol"]]
y = df["quality"]

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

# Convert original features into polynomial features
poly = PolynomialFeatures(degree=2)

X_train_poly = poly.fit_transform(X_train)
X_test_poly = poly.transform(X_test)

# Train model
model = LinearRegression()

model.fit(X_train_poly, y_train)

# Predictions
y_pred = model.predict(X_test_poly)

print("\n========== POLYNOMIAL REGRESSION ==========")

print("MSE:", mean_squared_error(y_test, y_pred))
print("R2 Score:", r2_score(y_test, y_pred))