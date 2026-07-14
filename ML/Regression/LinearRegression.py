
# ================================
# Linear Regression End-to-End
# ================================

# 1. Import Libraries
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# ================================
# 2. Load Dataset
# ================================
# Make sure advertising.csv is in same folder

df = pd.read_csv('advertising.csv')

print("First 5 rows:")
print(df.head())

# ================================
# 3. Data Preparation
# ================================
X = df[['TV', 'Radio', 'Newspaper']]   # Features
y = df['Sales']                        # Target

# ================================
# 4. Train-Test Split
# ================================
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

# ================================
# 5. Train Model
# ================================
model = LinearRegression()
model.fit(X_train, y_train)

# ================================
# 6. Predictions
# ================================
y_pred = model.predict(X_test)

# ================================
# 7. Evaluation
# ================================
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print("\nModel Performance:")
print("MSE:", mse)
print("R2 Score:", r2)

# ================================
# 8. Model Parameters
# ================================
print("\nModel Coefficients:")
print("TV:", model.coef_[0])
print("Radio:", model.coef_[1])
print("Newspaper:", model.coef_[2])
print("Intercept:", model.intercept_)

# ================================
# 9. Visualization (TV vs Sales)
# ================================
plt.scatter(df['TV'], df['Sales'])
plt.xlabel("TV Advertising")
plt.ylabel("Sales")
plt.title("TV vs Sales")
plt.show()

# ================================
# 10. Try Improved Model (Drop Newspaper)
# ================================
X2 = df[['TV', 'Radio']]

X2_train, X2_test, y_train, y_test = train_test_split(
    X2, y, test_size=0.2, random_state=42
)

model2 = LinearRegression()
model2.fit(X2_train, y_train)

y2_pred = model2.predict(X2_test)

print("\nImproved Model (without Newspaper):")
print("R2 Score:", r2_score(y_test, y2_pred))

# ================================
# 11. Predict New Value
# ================================
# Example: TV=200, Radio=40, Newspaper=50

new_data = np.array([[200, 40, 50]])
prediction = model.predict(new_data)

print("\nPredicted Sales for [200, 40, 50]:", prediction[0])

