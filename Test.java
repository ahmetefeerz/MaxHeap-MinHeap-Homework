public class Test {
    public static void main(String[] args) {
        Integer[] A = {14, 20, 2, 15, 10, 21};

        MaxHeapInterface<Integer> maxHeap = new MaxHeap<>();
        for (int x : A) maxHeap.add(x);

        System.out.println(maxHeap.isEmpty()
                ? "The heap is empty - INCORRECT"
                : "The heap is not empty; it contains " + maxHeap.getSize() + " entries.");

        System.out.println("The largest entry is " + maxHeap.getMax());
        System.out.println("\nRemoving entries in descending order:");
        while (!maxHeap.isEmpty())
            System.out.println("Removing " + maxHeap.removeMax());
    }
}
