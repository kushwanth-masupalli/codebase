package collectionframework;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // 1️⃣ Create LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // 2️⃣ Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);   // duplicate (ignored)
        set.add(40);

        System.out.println("LinkedHashSet: " + set);

        // 3️⃣ Size
        System.out.println("Size: " + set.size());

        // 4️⃣ Contains
        System.out.println("Contains 30? " + set.contains(30));
        System.out.println("Contains 50? " + set.contains(50));

        // 5️⃣ Remove element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // 6️⃣ Iteration (INSERTION ORDER PRESERVED)
        System.out.print("For-each iteration: ");
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 7️⃣ Iterator
        Iterator<Integer> it = set.iterator();
        System.out.print("Iterator iteration: ");
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
