package collectionframework;

public interface DList<T> extends DCollection<T> {
    // Insert element at the end
    boolean add(T t);

    // Insert element at a specific position
    void add(int index, T element);

    // Get element at index
    T get(int index);

    // Remove element at index
    T remove(int index);

    // Replace element at index
    T set(int index, T element);

    // Return index of first occurrence
    int indexOf(T element);

    // Return index of last occurrence
    int lastIndexOf(T element);

    // Number of elements
    int size();
}
