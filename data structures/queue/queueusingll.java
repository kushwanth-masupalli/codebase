
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class queueusingll {

    Node head;

    void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("nothing to delete");
        } else {
            head = head.next;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("queue is empty nothing to display");
        } else {
            Node current = head;
            while (current.next != null) {
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    public static void main(String[] args) {
        queueusingll o = new queueusingll();
        o.insert(8);
        o.delete();
        o.display();
    }

}
