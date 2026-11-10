"""
erarchical Clustering
Hierarchical Clustering is an unsupervised Machine Learning algorithm used to group similar data
 points into clusters by building a hierarchy (tree-like structure) of clusters.

 How does it work?
There are two approaches:
1. Agglomerative (Bottom-Up): Starts with every data point as its own cluster and
repeatedly merges the closest clusters.
2. Divisive (Top-Down): Starts with all data points in one cluster and repeatedly
splits them into smaller clusters.


2. How Agglomerative Clustering works
Imagine we have 5 data points: A, B, C, D, E.

1. Initially, every point is a separate cluster.
2. Find the two closest clusters.
3. Merge them into one cluster.
4. Repeat until all points belong to one cluster.



. What is a Dendrogram?
A Dendrogram is a tree-like diagram that shows how clusters are merged and at what distance.

We can draw a horizontal line across the dendrogram to decide how many clusters we want.
- Cut at one height → You might get 2 clusters.
- Cut at another height → You might get 3 or 4 clusters.
Unlike K-Means, we can inspect the hierarchy first and decide the number of clusters afterward.


What is Linkage?
Linkage determines how the distance between two clusters is calculated.
Linkage	How it calculates distance
Single	Minimum distance between points
Complete	Maximum distance between points
Average	Average distance between points
Ward	Merges clusters that cause the smallest increase in within-cluster variance

Ward linkage is a common starting choice.


import pandas as pd
import matplotlib.pyplot as plt

from sklearn.preprocessing import StandardScaler
from sklearn.cluster import AgglomerativeClustering
from scipy.cluster.hierarchy import dendrogram, linkage

# Load dataset
df = pd.read_csv("wine.csv", sep=";")

# Select features
X = df[
    [
        "alcohol",
        "volatile acidity",
        "citric acid",
        "sulphates"
    ]
]

# Feature scaling
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)

# Create dendrogram
# Use a sample because plotting all 4898 wines is too crowded
sample = X_scaled[:100]

linked = linkage(sample, method="ward")

plt.figure(figsize=(12, 6))
dendrogram(linked)

plt.title("Hierarchical Clustering Dendrogram")
plt.xlabel("Data Points")
plt.ylabel("Distance")
plt.show()

# Create clusters
model = AgglomerativeClustering(
    n_clusters=3,
    linkage="ward"
)

df["cluster"] = model.fit_predict(X_scaled)

# Display results
print(df[["alcohol", "volatile acidity", "cluster"]].head(10))

print("\nCluster Counts:")
print(df["cluster"].value_counts())
"""