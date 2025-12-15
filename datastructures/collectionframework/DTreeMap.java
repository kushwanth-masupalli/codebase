package collectionframework;

import java.util.TreeMap;
import java.util.Map;

public class DTreeMap {
    public static void main(String[] args) {

        // 1️⃣ Create TreeMap (keys automatically sorted)
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Add elements
        tm.put(50, "Apple");
        tm.put(20, "Banana");
        tm.put(40, "Cherry");
        tm.put(10, "Date");
        tm.put(30, "Elderberry");

        System.out.println("TreeMap: " + tm);

        // 2️⃣ Access first and last keys
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());

        // 3️⃣ Get value by key
        System.out.println("Value for key 30: " + tm.get(30));

        // 4️⃣ Remove element
        tm.remove(20);
        System.out.println("After removing key 20: " + tm);

        // 5️⃣ Check contains
        System.out.println("Contains key 40? " + tm.containsKey(40));
        System.out.println("Contains value 'Apple'? " + tm.containsValue("Apple"));

        // 6️⃣ Size and empty check
        System.out.println("Size: " + tm.size());
        System.out.println("Is empty? " + tm.isEmpty());

        // 7️⃣ Iterate over keys
        System.out.print("Keys: ");
        for (Integer key : tm.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // 8️⃣ Iterate over values
        System.out.print("Values: ");
        for (String value : tm.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 9️⃣ Iterate over entries
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10️⃣ Submaps
        System.out.println("HeadMap (less than 40): " + tm.headMap(40));
        System.out.println("TailMap (>=30): " + tm.tailMap(30));
        System.out.println("SubMap (30 to 50): " + tm.subMap(30, 50));

        // 11️⃣ Clear
        tm.clear();
        System.out.println("After clear: " + tm);
    }
}
