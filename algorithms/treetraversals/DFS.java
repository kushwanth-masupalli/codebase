package treetraversals;

import java.util.Scanner;
/**
 DFS in trees has 3 standard traversals:

 * 1) Preorder  = Root → Left → Right
 * 2) Inorder   = Left → Root → Right
 * 3) Postorder = Left → Right → Root
 * * In a Binary Search Tree, inorder traversal prints values in sorted order.

 *
 */



public class DFS {

    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            root =  insert(root,val);

        }
        preorder(root);



    }

    private static void preorder(Node root) {
        if(root==null){
            return ;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Node root) {
        if(root==null){
            return ;
        }

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    private static void postorder(Node root) {
        if(root==null){
            return ;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }


    private static Node insert(Node root, int val) {
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.val>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right=  insert(root.right,val);
        }
        return root;
    }


}



