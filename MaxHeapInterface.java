public interface MaxHeapInterface<T extends Comparable<T>> {
    void add(T value);
    T removeMax();
    T getMax();
    boolean isEmpty();
    int getSize();
    void clear();
}
