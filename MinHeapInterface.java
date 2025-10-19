public interface MinHeapInterface<T extends Comparable<T>> {
    void add(T value);
    T removeMin();
    T getMin();
    boolean isEmpty();
    int getSize();
    void clear();
}
