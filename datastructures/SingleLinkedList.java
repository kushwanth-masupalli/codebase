
public class SingleLinkedList {
      static class Node{
          int val;
          Node next;
          public Node(int val){
              this.val = val;
          }
      }


    public static void main(String[] args) {
         Node n1 = new Node(1);
         Node n2 = new Node(2);
         Node n3 = new Node(3);
         n1.next = n2;
         n2.next = n3;

         Node temp= n1;
         while(n1!=null){
             System.out.println(n1.val);
             n1 = n1.next;
         }
    }
}


