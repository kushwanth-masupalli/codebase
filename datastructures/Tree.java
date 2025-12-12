/*
 *  TREE
 *  ----
 *  A tree is a hierarchical data structure made of nodes connected without cycles.
 *  It has a parent–child relationship and exactly one root node.
 *
 *  Core Differences Between a Graph and a Tree
 *  -------------------------------------------
 *  1) A tree cannot contain cycles, but a graph may contain cycles.
 *  2) A tree must be connected; a graph can be disconnected.
 *  3) A tree with N nodes always has N-1 edges; a graph can have any number of edges.
 *  4) A tree has a root (starting point); graphs do not have a root concept.
 *  5) There is exactly one unique path between any two nodes in a tree;
 *     in a graph, there can be multiple paths.
 *
 *  Terminologies
 *  -------------
 *  root, parent, child, sibling, leaf, subtree, height, depth, level, edge
 *
 *  Types of Trees
 *  --------------
 *  1) Binary Tree            - Each node has at most 2 children.
 *  2) Binary Search Tree     - Left < Root < Right property.
 *  3) AVL / Red-Black Tree   - Self-balancing BSTs.
 *  4) Heap                   - Complete binary tree used for priority queue
 *                              (Min-Heap or Max-Heap).
 *
 *  Tree Traversals
 *  ----------------
 *  DFS Traversals:
 *     - Preorder   (Root → Left → Right)
 *     - Inorder    (Left → Root → Right)
 *     - Postorder  (Left → Right → Root)
 *
 *  BFS Traversal:
 *     - Level Order Traversal
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tree {

    static class Node{
        int val;
        ArrayList<Node> arr ;
        public Node(int a, ArrayList<Node> b){
            val = a;
            arr =b ;
        }
    }
    public static void main(String[] args) {


        Node root = new Node(1,new ArrayList<>());
        Node n2 = new Node(2,new ArrayList<>());
        Node n3 = new Node(3,new ArrayList<>());
        Node n4 = new Node(4,new ArrayList<>());
        Node n5 = new Node(5,new ArrayList<>());

        root.arr.add(n2);
        root.arr.add(n3);
        n2.arr.add(n4);
        n3.arr.add(n5);

        preorder(root);
    }

    private static void preorder(Node root) {
              if(root==null){
                  return ;
              }
        System.out.println(root.val);
               for(Node i : root.arr){
                  preorder(i);
              }



    }


}

