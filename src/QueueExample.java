import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);

        // Peek the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Queue after dequeue: " + queue);

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Get the size of the queue
        System.out.println("Size of the queue: " + queue.size());
    }
}
