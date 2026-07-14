package graphtraversal;

import java.util.*;

class inorderTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;

        inorder(root.left, arr);
        System.out.print(root.val + " ");
        arr.add(root.val);
        inorder(root.right, arr);
    }

    public static void inorder(TreeNode root, int n1, int n2) {
        if (root == null)
            return;
         if (root.val == n1) {
            root.val = n2;
        } else if (root.val == n2) {
            root.val = n1;
        }

        inorder(root.left, n1, n2);
        inorder(root.right, n1, n2);
    }

    public static void main(String[] args) {

        // Creating a sample tree
        /*
         * 4
         * / \
         * 2 6
         * / \ / \
         * 1 3 5 7
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        List<Integer> arr = new ArrayList<>();

        inorder(root, arr);

        List<Integer> arr2 = new ArrayList<Integer>(arr);
        Collections.sort(arr2);
        int n1 = -1;
        int n2 = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr2.get(i))) {
                if (n1 == -1) {
                    n1 = arr.get(i);
                }
                n2 = arr.get(i); // keep updating
            }
        }

        inorder(root, n1, n2);
         System.out.println();
        inorder(root, arr2);

    }
}