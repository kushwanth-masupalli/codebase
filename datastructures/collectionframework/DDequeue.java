package collectionframework;

public interface DDequeue<T> {

    // Insert operations
    void addFirst(T t);
    void addLast(T t);

    boolean offerFirst(T t);
    boolean offerLast(T t);

    // Remove operations
    T removeFirst();
    T removeLast();

    T pollFirst();
    T pollLast();

    // Access operations
    T getFirst();
    T getLast();

    T peekFirst();
    T peekLast();
}
