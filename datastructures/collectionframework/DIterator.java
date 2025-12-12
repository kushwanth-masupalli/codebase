package collectionframework;

public interface DIterator<E> {
    boolean hasNext();    // Returns true if there are more elements
    E next();             // Returns the next element
    void remove();        // Removes the last returned element
}
