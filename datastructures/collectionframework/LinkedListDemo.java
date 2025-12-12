package collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 1. Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);                // add at end
        list.add(20);
        list.add(30);
        System.out.println("Initial LinkedList: " + list);

        // 2. Add elements at beginning or end
        list.addFirst(5);           // add at head
        list.addLast(40);           // add at tail
        System.out.println("After addFirst & addLast: " + list);

        // 3. Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove((Integer) 20);  // remove by value
        System.out.println("After removals: " + list);

        // 5. Size and empty check
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());

        // 6. Contains
        System.out.println("Contains 10? " + list.contains(10));

        // 7. IndexOf and LastIndexOf
        list.add(30);
        System.out.println("First index of 30: " + list.indexOf(30));
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // 8. Iterating elements
        System.out.print("Iterating LinkedList: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 9. Convert to array
        Object[] array = list.toArray();
        System.out.println("Array version: " + java.util.Arrays.toString(array));

        // 10. Clear
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
