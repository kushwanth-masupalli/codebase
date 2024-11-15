class Node{
    int data;
    Node  next;

    Node(int data){
        this.data = data;
    }
}

public class stackusinglinkedlist{
    Node head;
    int size;

    void push(int data){
        size++;
        Node n = new Node(data);
        if(head ==null){
            head = n;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = n;
        }
    }

    void pop(){
        if(head == null){
            System.out.println("nothing to delete");
        }
        else{
           // Node prev =  head;
            Node current = head;
            while(current.next.next!=null){
               // prev = current;
                current = current.next;
            }
            current.next= null;
        }
    }

    void display(){
        Node current = head;
        while(current.next!=null){
            System.out.println(current.data);
            current =current.next;
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        stackusinglinkedlist s = new stackusinglinkedlist();
        s.push(5);
        s.push(8);
        s.push(3);
        s.push(33);
        s.push(89);
        s.pop();
        s.display();
    }

}