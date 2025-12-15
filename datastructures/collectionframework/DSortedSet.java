package collectionframework;

public interface DSortedSet<T> extends DSet<T> {

    // Returns the first (lowest) element
    T first();

    // Returns the last (highest) element
    T last();

    // Returns a view of the portion of this set whose elements are strictly less than toElement
    DSortedSet<T> headSet(T toElement);

    // Returns a view of the portion of this set whose elements are greater than or equal to fromElement
    DSortedSet<T> tailSet(T fromElement);

    // Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
    DSortedSet<T> subSet(T fromElement, T toElement);
}
