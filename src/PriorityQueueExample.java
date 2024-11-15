import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // Creating a PriorityQueue of integers
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("B");
        priorityQueue.add("X");

        System.out.println("PriorityQueue: " + priorityQueue);

        // Creating a PriorityQueue with a custom comparator for descending order
        PriorityQueue<String> customQueue = new PriorityQueue<>(Collections.reverseOrder());
        customQueue.add("A");
        customQueue.add("B");
        customQueue.add("X");
        customQueue.add("C");
        customQueue.add("Z");

        System.out.println("\nCustom PriorityQueue (Descending): " + customQueue);
    }
}
