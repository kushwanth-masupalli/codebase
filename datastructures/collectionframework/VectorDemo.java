package collectionframework;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // 1. Create Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Initial Vector: " + vector);

        // 2. Add elements at specific index
        vector.add(1, 15); // add 15 at index 1
        System.out.println("After adding 15 at index 1: " + vector);

        // 3. Access elements
        System.out.println("Element at index 2: " + vector.get(2));
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // 4. Remove elements
        vector.remove(1);            // remove element at index 1
        vector.remove((Integer) 30); // remove element by value
        System.out.println("After removals: " + vector);

        // 5. Size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // 6. Contains
        System.out.println("Contains 20? " + vector.contains(20));

        // 7. IndexOf and LastIndexOf
        vector.add(10);
        System.out.println("First index of 10: " + vector.indexOf(10));
        System.out.println("Last index of 10: " + vector.lastIndexOf(10));

        // 8. Iteration
        System.out.print("Iterating Vector: ");
        for (int val : vector) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 9. Clear
        vector.clear();
        System.out.println("After clear(): " + vector);
    }
}
