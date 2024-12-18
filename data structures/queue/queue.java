
public class queue {

    int[] arr = new int[6];
    int top = -1;
    int rear = -1;

    void insert(int a) {
        if (rear == arr.length - 1) {
            System.out.println("the queue is full");
        } else if (rear == -1) {
            top++;
            arr[top] = a;
            rear++;
        } else {

            rear++;
            arr[rear] = a;
        }
    }

    void delete() {
        if(front == rear)
      printf("\nQueue is Empty!!! Deletion is not possible!!!");
   else{
      printf("\nDeleted : %d", queue[front]);
      front++;
      if(front == rear)
	 front = rear = -1;
   }

    }

    void display() {
        if (top == -1 || top > rear) {
            System.out.println("the queue is empty");
            return;
        }
        for (int i = top; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        queue o = new queue();
        o.insert(4);
        o.delete();
        o.display();
    }
}
