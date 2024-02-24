package CollectionFramework;

import java.util.*;

public class DequeVsQueueExample {
    public static void main(String[] args) {
        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Retrieves and removes the head of the queue
        }

        // Deque Example
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");

        System.out.println("\nDeque:");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst()); // Retrieves and removes the first element
        }
    }
}
