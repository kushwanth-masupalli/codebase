/*
    A graph is a data structure made of nodes (vertices) and edges connecting them.

    Classification based on edges:
        1) Directed graph
        2) Undirected graph
        (Bidirectional edges are represented as two directed edges)

    Cycle in a graph:
        1) A closed path
        2) Start and end at the same node
        3) Do not use the same edge twice
        4) Must include at least 3 distinct nodes

    A graph containing at least one cycle → Cyclic graph
    A graph containing no cycles → Acyclic graph

    Path:
        A sequence of edges to go from one node to another without repeating edges.

    Based on weights:
        1) Weighted graph
        2) Unweighted graph

    Degrees (Undirected):
        Degree of node = number of connected edges
        Sum of degrees of all nodes = 2 × number of edges

    Directed:
        Indegree  = number of edges coming into a node
        Outdegree = number of edges going out

*/

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // adjacency matrix
        int[][] matrix = new int[n][n];

        // adjacency list
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) arr.add(new ArrayList<>());

        // reading edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            matrix[u][v] = 1;
            matrix[v][u] = 1;

            arr.get(u).add(v);
            arr.get(v).add(u);
        }

        // print edges using adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (matrix[i][j] == 1)
                    System.out.println("There is an edge between " + i + " and " + j);
            }
        }

        /*
            Weighted graph:
                matrix[u][v] = weight;
                arr.get(u).add(new int[]{v, weight});

            Space complexities:
                Adjacency matrix → O(n^2)
                Adjacency list   → O(2m) for undirected graph
        */
    }
}
