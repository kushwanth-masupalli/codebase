package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        // 1️⃣ Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // 2️⃣ Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);   // duplicate (ignored)

        System.out.println("HashSet: " + set);

        // 3️⃣ Size
        System.out.println("Size: " + set.size());

        // 4️⃣ Contains
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 40? " + set.contains(40));

        // 5️⃣ Remove element
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // 6️⃣ Iteration (NO ORDER GUARANTEE)
        System.out.print("Iterating using for-each: ");
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 7️⃣ Iterator
        Iterator<Integer> it = set.iterator();
        System.out.print("Iterating using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8️⃣ Is empty
        System.out.println("Is empty? " + set.isEmpty());

        // 9️⃣ Clear
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
