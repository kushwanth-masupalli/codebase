package collectionframework;

public interface SortedMap<K, V> extends Map<K, V> {

    // Returns the first (lowest) key
    K firstKey();

    // Returns the last (highest) key
    K lastKey();

    // Returns a view of the portion of this map whose keys are strictly less than toKey
    SortedMap<K, V> headMap(K toKey);

    // Returns a view of the portion of this map whose keys are greater than or equal to fromKey
    SortedMap<K, V> tailMap(K fromKey);

    // Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive
    SortedMap<K, V> subMap(K fromKey, K toKey);
}
