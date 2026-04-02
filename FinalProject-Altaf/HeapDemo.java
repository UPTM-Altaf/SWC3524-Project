import java.util.*;

public class HeapDemo {

    public static void main(String[] args) {

        // MIN HEAP
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(3);
        minHeap.add(15);

        System.out.println("MIN HEAP:");
        System.out.println("Heap: " + minHeap);
        System.out.println("Remove (min): " + minHeap.poll());
        System.out.println("After removal: " + minHeap);

        System.out.println("-------------------");

        // MAX HEAP
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(3);
        maxHeap.add(15);

        System.out.println("MAX HEAP:");
        System.out.println("Heap: " + maxHeap);
        System.out.println("Remove (max): " + maxHeap.poll());
        System.out.println("After removal: " + maxHeap);
    }
}