/*    Binary Search Tree = is a type of  tree where the value of the left node is always less than the root and the value
      of the right node is always greater than the root .



* */

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {

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
        System.out.println(root.val);;
        preorder(root.left);
        preorder(root.right);
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



