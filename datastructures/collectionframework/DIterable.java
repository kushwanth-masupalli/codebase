package collectionframework;

public interface DIterable<T> {
    // Returns an iterator over elements of type T
    DIterator<T> iterator();

    // Simplified forEach using iterator()
    default void forEach(Action<? super T> action) {
        DIterator<T> it = iterator();
        while (it.hasNext()) {
            action.execute(it.next());
        }
    }

    // Simple functional interface for action
    interface Action<T> {
        void execute(T t);
    }
}
