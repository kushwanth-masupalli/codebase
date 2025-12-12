package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Create ArrayList
        List<Integer> arr = new ArrayList<>(Arrays.asList(23, 23, 2, 332, 2));
        System.out.println("Initial ArrayList: " + arr);

        // 2. Add elements
        arr.add(10);               // Add at end
        arr.add(1, 50);            // Add at index
        System.out.println("After adding 10 and 50 at index 1: " + arr);

        // 3. Get element
        System.out.println("Element at index 0: " + arr.get(0));

        // 4. Set element
        arr.set(2, 99);            // Replace index 2 with 99
        System.out.println("After setting index 2 to 99: " + arr);

        // 5. Remove element
        arr.remove(3);             // Remove by index
        arr.remove(Integer.valueOf(2)); // Remove first occurrence of value 2
        System.out.println("After removals: " + arr);

        // 6. Size and isEmpty
        System.out.println("Size of ArrayList: " + arr.size());
        System.out.println("Is ArrayList empty? " + arr.isEmpty());

        // 7. Contains
        System.out.println("Does ArrayList contain 332? " + arr.contains(332));

        // 8. IndexOf and LastIndexOf
        arr.add(23);
        System.out.println("First index of 23: " + arr.indexOf(23));
        System.out.println("Last index of 23: " + arr.lastIndexOf(23));

        // 9. Clear
        List<Integer> temp = new ArrayList<>(arr);
        temp.clear();
        System.out.println("After clear(): " + temp);

        // 10. Iterating elements
        System.out.print("Iterating ArrayList using for-each: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(arr);
        System.out.println("After sorting: " + arr);

        // 12. Reverse
        Collections.reverse(arr);
        System.out.println("After reversing: " + arr);

        // 13. Convert to array
        Object[] array = arr.toArray();
        System.out.println("Array version: " + Arrays.toString(array));

        // 14. Add all
        List<Integer> anotherList = new ArrayList<>(Arrays.asList(100, 200));
        arr.addAll(anotherList);
        System.out.println("After addAll(): " + arr);

        // 15. RemoveAll
        arr.removeAll(anotherList);
        System.out.println("After removeAll(): " + arr);

        // 16. SubList
        List<Integer> subList = arr.subList(1, 4);
        System.out.println("SubList (1 to 3): " + subList);
    }
}
