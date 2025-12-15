package collectionframework;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;

public class DPriorityQueue {
    public static void main(String[] args) {

        /* =========================
           1. MIN HEAP (DEFAULT)
           ========================= */
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        // Add elements
        minPQ.add(40);
        minPQ.add(10);
        minPQ.add(30);
        minPQ.add(20);

        System.out.println("Min Heap PQ: " + minPQ);

        // Peek (smallest element)
        System.out.println("Peek (min): " + minPQ.peek());

        // Poll / Remove (smallest first)
        System.out.println("Poll: " + minPQ.poll());
        System.out.println("After poll: " + minPQ);

        // Size
        System.out.println("Size: " + minPQ.size());

        // Contains
        System.out.println("Contains 30? " + minPQ.contains(30));

        // Iterate (NOT sorted)
        System.out.print("Iteration: ");
        for (int x : minPQ) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Remove specific element
        minPQ.remove(30);
        System.out.println("After removing 30: " + minPQ);

        // Clear
        minPQ.clear();
        System.out.println("After clear: " + minPQ);


        /* =========================
           2. MAX HEAP
           ========================= */
        PriorityQueue<Integer> maxPQ =
                new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(10);
        maxPQ.add(40);
        maxPQ.add(20);
        maxPQ.add(30);

        System.out.println("\nMax Heap PQ: " + maxPQ);

        // Peek (largest element)
        System.out.println("Peek (max): " + maxPQ.peek());

        // Poll in sorted descending order
        System.out.print("Polling max-heap: ");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " ");
        }
        System.out.println();


        /* =========================
           3. USING ITERATOR
           ========================= */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);

        Iterator<Integer> it = pq.iterator();
        System.out.print("\nIterator traversal: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


        /* =========================
           4. CHECK EMPTY
           ========================= */
        System.out.println("Is empty? " + pq.isEmpty());


        /* =========================
           5. CONVERT TO ARRAY
           ========================= */
        Object[] arr = pq.toArray();
        System.out.print("Array form: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
