# 1_data_processing.py

"""
 data processing means cleaning and transforming raw data into a format that ml models can understand
"""

import numpy as np
import pandas as pd


#to load the data we will use pandas
df = pd.read_csv("wine.csv",sep=';')
print(df.head())

#  will print the first 5 lines of the csv file
print(df.head())

# Display last 5 rows
print(df.tail())

# Number of rows and columns
print(df.shape)

# Column names and data types
print(df.columns)
print(df.dtypes)

print("basic info about the dataset ")
df.info()

# Statistical summary of numerical columns
print(df.describe())

# Count missing values in each column
print(df.isnull().sum())

# Check duplicate rows
print(df.duplicated().sum())

# to remove rows containing missing values
df.dropna(inplace=True)

#to fill missing values with the column mean
df["age"].fillna(df["age"].mean(),inplace=True)

# Fill missing categorical values with the most
# frequently occurring value (mode)
df["City"].fillna(df["City"].mode()[0], inplace=True)

# Remove duplicate rows
df.drop_duplicates(inplace=True)


# Select a single column
print(df["Age"])

# Select multiple columns
print(df[["Age", "Salary"]])

# Filter rows based on a condition
print(df[df["Age"] > 25])