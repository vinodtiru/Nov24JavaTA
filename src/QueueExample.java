import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue (enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Initial Queue: " + queue);

        // Removing elements from the queue (dequeue)
        int removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Peek at the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
        System.out.println("Queue after removal: " + queue);

        // Size of the queue
        System.out.println("Queue Size: " + queue.size());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        while (!queue.isEmpty()) {
            System.out.println("Next Element: " + queue.poll());
        }

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
