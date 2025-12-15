package collectionframework;

import java.util.TreeSet;
import java.util.Iterator;

public class DTreeSet {
    public static void main(String[] args) {

        // 1️⃣ Create TreeSet (Sorted, no duplicates)
        TreeSet<Integer> ts = new TreeSet<>();

        // Add elements
        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(40); // duplicate ignored

        System.out.println("TreeSet: " + ts);

        // 2️⃣ Access first and last
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        // 3️⃣ Remove elements
        ts.remove(20);
        System.out.println("After removing 20: " + ts);

        // 4️⃣ Subsets
        System.out.println("HeadSet (less than 40): " + ts.headSet(40));
        System.out.println("TailSet (>= 30): " + ts.tailSet(30));
        System.out.println("SubSet (30 to 50): " + ts.subSet(30, 50));

        // 5️⃣ Check contains
        System.out.println("Contains 30? " + ts.contains(30));
        System.out.println("Contains 20? " + ts.contains(20));

        // 6️⃣ Iterate
        System.out.print("Iterating TreeSet: ");
        for (int x : ts) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 7️⃣ Iterator
        Iterator<Integer> it = ts.iterator();
        System.out.print("Iterator traversal: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8️⃣ Size and empty check
        System.out.println("Size: " + ts.size());
        System.out.println("Is empty? " + ts.isEmpty());

        // 9️⃣ Clear
        ts.clear();
        System.out.println("After clear: " + ts);
    }
}
