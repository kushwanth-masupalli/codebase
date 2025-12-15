package collectionframework;

public interface Map<K, V> {

    // Put key-value pair
    V put(K key, V value);

    // Get value by key
    V get(K key);

    // Remove entry by key
    V remove(K key);

    // Check if key exists
    boolean containsKey(K key);

    // Check if value exists
    boolean containsValue(V value);

    // Get number of entries
    int size();

    // Check if empty
    boolean isEmpty();

    // Clear all entries
    void clear();
}
