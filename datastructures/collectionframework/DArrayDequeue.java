package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DArrayDequeue {
    public static void main(String[] args) {

        // Create ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();

        // 1️⃣ Add elements (both ends)
        dq.addFirst(10);
        dq.addLast(20);
        dq.offerFirst(5);
        dq.offerLast(30);

        System.out.println("ArrayDeque after additions: " + dq);

        // 2️⃣ Access elements
        System.out.println("First element (getFirst): " + dq.getFirst());
        System.out.println("Last element (getLast): " + dq.getLast());

        // 3️⃣ Peek elements (no removal)
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        // 4️⃣ Remove elements
        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());

        System.out.println("ArrayDeque after removals: " + dq);

        // 5️⃣ Stack behavior (LIFO)
        dq.push(100);   // same as addFirst
        dq.push(200);
        System.out.println("After stack push: " + dq);
        System.out.println("Stack pop: " + dq.pop()); // removes first

        // 6️⃣ Queue behavior (FIFO)
        dq.offer(300);   // addLast
        System.out.println("Queue poll: " + dq.poll()); // removeFirst

        // 7️⃣ Size and empty
        System.out.println("Size: " + dq.size());
        System.out.println("Is empty? " + dq.isEmpty());

        // 8️⃣ Iteration
        System.out.print("Iterating ArrayDeque: ");
        for (int x : dq) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 9️⃣ Clear
        dq.clear();
        System.out.println("After clear: " + dq);
    }
}
