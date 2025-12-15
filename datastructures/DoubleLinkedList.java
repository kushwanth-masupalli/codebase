
public class DoubleLinkedList {

    static class Node{
        int val;
        Node prev;
        Node next ;
         Node(int val){
          this.val = val;
        }
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.prev = n4;
        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        Node tail = n5;
        while(tail!=null){
            System.out.println(tail.val);
            tail = tail.prev;
        }



    }
}
