
class Node {

    int data;
    Node next;

    Node(int a) {
        data = a;
    }
}

public class linkedlist {

    Node head;
    int size = 0;

    void insertatend(int data) {
        Node n = new Node(data);
        size++;
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

    void insertatfirst(int data) {
        Node n = new Node(data);
        size++;
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void insertatpos(int data, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("invalid input");
            return;
        }
        if (pos == 1) {
            insertatfirst(data);
            return;
        }
        if (pos == size + 1) {
            insertatend(data);
            return;
        }
        Node current = new Node(data);
        Node pre = head;
        Node temp = head;

        while (pos > 1) {
            pre = temp;
            temp = temp.next;
            pos--;
        }
        pre.next = current;
        current.next = temp;
        size++;
    }

    void deleteatend() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            size--;
            Node current = head;
            Node pre = head;
            while (current.next != null) {
                pre = current;
                current = current.next;
            }
            pre.next = null;
        }
    }

    void deleteatfirst() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            size--;
            head = head.next;
        }
    }

    void deleteatpos(int pos) {
        int i = 0;
        Node current = head;
        Node pre = head;
        while (i < pos) {
            pre = current;
            current = current.next;
            i++;
        }
        pre.next = current.next;
    }

    public static void main(String[] args) {
        linkedlist o = new linkedlist();
        o.insertatend(1);
        o.insertatend(2);
        o.insertatend(3);
        o.insertatfirst(100);
        o.insertatpos(4, 2);
        o.insertatfirst(33);
        o.deleteatpos(3);
        o.deleteatend();
        o.deleteatfirst();
        o.display();

    }
}
