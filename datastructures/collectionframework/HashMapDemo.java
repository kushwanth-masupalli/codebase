package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        // 1️⃣ Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2️⃣ Add elements (put)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(2, "Blueberry"); // replaces existing key 2

        System.out.println("HashMap: " + map);

        // 3️⃣ Get value by key
        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Value for key 5: " + map.get(5)); // null

        // 4️⃣ Remove element
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // 5️⃣ Check contains
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // 6️⃣ Size & empty
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());

        // 7️⃣ Iterate over keys
        System.out.print("Keys: ");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // 8️⃣ Iterate over values
        System.out.print("Values: ");
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 9️⃣ Iterate over entries
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10️⃣ Clear map
        map.clear();
        System.out.println("After clear: " + map);
    }
}
