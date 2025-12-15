package collectionframework;

public interface DQueue<T>  {

    // Insert element at rear
    boolean add(T t);

    // Remove element from front
    T remove();

    // View front element
    T peek();
}
