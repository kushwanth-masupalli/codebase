package recursion;

public class HeightOfABinaryTree {
    public static void main(){
          Node n1 = new Node(10);
          n1.left = new Node(20);
          n1.right =new Node(30);
          n1.left.left = new Node(34);
          n1.left.left.right = new Node(234);
          n1.left.left.right.right =new Node(2342);
          n1.right.right = new Node(232);

          System.out.println(heightOfABinaryTree(n1));
    }

    private static int heightOfABinaryTree(Node n1) {
         if(n1==null){
             return 0;
         }
         return 1+Math.max(heightOfABinaryTree(n1.left),heightOfABinaryTree(n1.right));
    }
}

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}




