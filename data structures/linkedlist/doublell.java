
class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doublell {

    Node head;

    // Insert at the beginning
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display the list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublell dll = new doublell();
        dll.insertAtHead(10);
        dll.insertAtTail(20);
        dll.insertAtHead(5);
        dll.display(); // Output: 5 10 20

    }
}
