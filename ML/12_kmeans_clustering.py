"""
K means clustering
K-Means is an unsupervised Machine Learning algorithm used to group similar data points into clusters.

How does K-Means work?
K-Means follows these steps:
1. Choose K: Decide how many clusters you want.
2. Initialize centroids: Randomly select K initial cluster centers.
3. Assign points: Assign each data point to its nearest centroid.
4. Update centroids: Calculate the mean position of all points in each cluster.
5. Repeat: Repeat assignment and centroid updates until the clusters stop changing significantly.

K represents the number of clusters we want to create.

What is a centroid?
A centroid is the center point of a cluster.

K-Means calculates the centroid by taking the mean of all data points assigned to that cluster.
How do we choose K?
We usually use the Elbow Method.

Elbow Method helps us choose the optimal number of clusters (K) in K-Means.
1. Run K-Means with different K values (1, 2, 3, 4...).
2. Calculate inertia (WCSS) for each K. It measures how far data points are from their assigned centroids.
3. Plot K against inertia.
4. Find the point where the curve bends like an elbow.

We train K-Means with different values of K and calculate the Within-Cluster Sum of Squares (WCSS), also called inertia.

"""

import pandas as pd
import matplotlib.pyplot as plt

from sklearn.preprocessing import StandardScaler
from sklearn.cluster import KMeans

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

# Elbow Method: find a suitable K
inertia = []

for k in range(1, 11):
    model = KMeans(
        n_clusters=k,
        random_state=42,
        n_init=10
    )

    model.fit(X_scaled)
    inertia.append(model.inertia_)

# Plot elbow graph
plt.plot(range(1, 11), inertia, marker="o")
plt.xlabel("Number of Clusters (K)")
plt.ylabel("Inertia")
plt.title("Elbow Method")
plt.show()

# Train final K-Means model
model = KMeans(
    n_clusters=3,
    random_state=42,
    n_init=10
)

# Assign cluster labels
df["cluster"] = model.fit_predict(X_scaled)

# Display results
print(df[["alcohol", "volatile acidity", "cluster"]].head(10))

print("\nCluster Counts:")
print(df["cluster"].value_counts())

"""
Parameter	Meaning
n_clusters	Number of clusters (K)
init	Method used to initialize centroids
n_init	Number of different initializations
max_iter	Maximum iterations
random_state	Makes results reproducible


"""