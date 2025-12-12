package collectionframework;

public interface DCollection<E> extends DIterable<E> {
    int size();                   // Returns number of elements
    boolean isEmpty();            // True if collection is empty
    boolean contains(Object o);   // Checks if element exists
    boolean add(E e);             // Adds element
    boolean remove(Object o);     // Removes element
    void clear();                 // Clears all elements
    DIterator<E> iterator();       // Returns an iterator
}
