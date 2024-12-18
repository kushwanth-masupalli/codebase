class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class circularlinkedlist {
    node head;
    int size = 0;

    void insertatend(int a) {
        size++;
        node newnode = new node(a);
        if (head == null) {
            head = newnode;
            head.next = head;
        } else {
            node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }
    }

    void deleteatfirst() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            size--;
            node current = head;
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next = head;
        }
    }

    void deleteatend() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            size--;
            node temp = head;
            node prev = null;
            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = head;
        }
    }

    void insertatfirst(int a) {
        size++;
        node newnode = new node(a);
        if (head == null) {
            head = newnode;
            head.next = head;
        } else {
            node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newnode.next = head;
            head = newnode;
            temp.next = head;
        }
    }

    void insertatpos(int data, int pos) {
        if (pos > size || pos < 0) {
            System.out.println("bro its not possible");
        } else if (pos == 0) {
            insertatfirst(data);
        } else if (pos == size) {
            insertatend(data);
        } else {
            size++;
            node temp = head;
            node prev = null;
            while (pos > 1) {
                prev = temp;
                temp = temp.next;
                pos--;
            }
            node newnode = new node(data);
            prev.next = newnode;
            newnode.next = temp;
        }
    }

    void deleteatpos(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Not possible bro");
            return;
        }
        if (pos == 0) {
            deleteatfirst();
        } else {
            size--;
            node temp = head;
            node prev = null;
            while (pos > 0) {
                prev = temp;
                temp = temp.next;
                pos--;
            }
            prev.next = temp.next;
        }
    }

    void show() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        circularlinkedlist cl = new circularlinkedlist();
        cl.insertatend(3);
        cl.insertatend(44);
        cl.insertatend(444);
        cl.insertatend(4488);
        cl.insertatend(4343);
        cl.insertatpos(2, 2);
        cl.insertatfirst(38383);
        cl.deleteatpos(2);
        cl.show();
    }
}
