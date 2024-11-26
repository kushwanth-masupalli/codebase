
public class circularqueue {

    int[] arr = new int[6];
    int front = -1;
    int rear = -1;
    int size = arr.length;

    void insert(int a) {
        // Check if the queue is full
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == -1) { // If queue is initially empty
            front = 0;
            rear = 0;
            arr[rear] = a;
        } else {
            rear = (rear + 1) % size;
            arr[rear] = a;
        }
    }

    void delete() {
        if (front == -1) { // Queue is empty
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) { // Only one element was present
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("The queue is empty");
            return;
        }

        System.out.println("Queue elements are:");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) {
                break;

            }
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularqueue o = new circularqueue();
        o.insert(34);
        o.insert(6);
        o.insert(77);
        o.insert(55);
        o.insert(44);
        o.insert(99);
        o.delete();
        o.delete();
        o.delete();
        o.delete();
        o.delete();
        o.delete();
        o.insert(4);
        o.display();

    }
}
