package collectionframework;

public interface DSet<T>  {

    // Adds element (no duplicates allowed)
    boolean add(T t);

    // Removes specified element
    boolean remove(T t);

    // Checks if element exists
    boolean contains(T t);

    // Number of elements
    int size();

    // Removes all elements
    void clear();
}
