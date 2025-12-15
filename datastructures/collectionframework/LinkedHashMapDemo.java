package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        // 1️⃣ Create LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        // 2️⃣ Add elements (insertion order is preserved)
        lhm.put(3, "Cherry");
        lhm.put(1, "Apple");
        lhm.put(4, "Date");
        lhm.put(2, "Banana");
        lhm.put(1, "Apricot"); // key 1 is updated, position unchanged

        System.out.println("LinkedHashMap: " + lhm);

        // 3️⃣ Get value by key
        System.out.println("Value for key 2: " + lhm.get(2));

        // 4️⃣ Remove element
        lhm.remove(3);
        System.out.println("After removing key 3: " + lhm);

        // 5️⃣ Check contains
        System.out.println("Contains key 4? " + lhm.containsKey(4));
        System.out.println("Contains value 'Banana'? " + lhm.containsValue("Banana"));

        // 6️⃣ Size and empty
        System.out.println("Size: " + lhm.size());
        System.out.println("Is empty? " + lhm.isEmpty());

        // 7️⃣ Iterate over keys
        System.out.print("Keys: ");
        for (Integer key : lhm.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // 8️⃣ Iterate over values
        System.out.print("Values: ");
        for (String value : lhm.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 9️⃣ Iterate over entries
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10️⃣ Clear
        lhm.clear();
        System.out.println("After clear: " + lhm);
    }
}
