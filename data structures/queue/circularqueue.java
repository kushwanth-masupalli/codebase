
public class circularqueue {

    int rear = -1;
    int front = -1;
    int[] arr = new int[6];
    int size = arr.length;

    void insert(int data) {
        if (front == -1) {
            front++;
            rear++;
            arr[rear] = data;
        } else if ((rear + 1) % size == front) {
            System.out.println("the queue is full");
        } else {
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
    }

    void delete() {
        if (front == -1) {
            System.out.println("the queue is empty");
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("the queue is empty");
            return;
        }
        int temp = front;
        while (true) {
            System.out.println(arr[temp]);
            if (temp == rear) {
                break;
            }
            temp = (temp + 1) % size;
        }

    }

    public static void main(String[] args) {
        circularqueue cq = new circularqueue();
        cq.insert(2);
        cq.insert(44);
        cq.insert(34);
        cq.insert(44);
        cq.insert(44);
        cq.insert(4344);
        cq.delete();
        cq.insert(44444);
        cq.display();
    }

}
