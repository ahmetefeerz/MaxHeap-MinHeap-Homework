import java.util.List;

public class MinHeap<T extends Comparable<T>> implements MinHeapInterface<T> {
    private T[] heap;
    private int size;
    private static final int DEFAULT_CAPACITY = 50;

    @SuppressWarnings("unchecked")
    public MinHeap() {
        heap = (T[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    public MinHeap(List<T> list) {
        this();
        for (T item : list) heap[++size] = item;
        for (int i = size / 2; i > 0; i--) heapifyDown(i);
    }

    public void add(T value) {
        heap[++size] = value;
        heapifyUp(size);
    }

    public T removeMin() {
        if (isEmpty()) return null;
        T root = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);
        return root;
    }

    public T getMin() { return isEmpty() ? null : heap[1]; }

    public boolean isEmpty() { return size == 0; }

    public int getSize() { return size; }

    public void clear() { size = 0; }

    private void heapifyUp(int i) {
        while (i > 1 && heap[i].compareTo(heap[i / 2]) < 0) {
            swap(i, i / 2);
            i /= 2;
        }
    }

    private void heapifyDown(int i) {
        while (2 * i <= size) {
            int smaller = 2 * i;
            if (smaller + 1 <= size && heap[smaller + 1].compareTo(heap[smaller]) < 0)
                smaller++;
            if (heap[i].compareTo(heap[smaller]) <= 0) break;
            swap(i, smaller);
            i = smaller;
        }
    }

    private void swap(int a, int b) {
        T temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}
