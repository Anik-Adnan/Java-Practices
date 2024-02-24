package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueExample01 {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(6);

        // Displaying the elements of the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // peek method: Retrieves, but does not remove, the head of this queue
        System.out.println("Peek: " + priorityQueue.peek());

        // poll method: Retrieves and removes the head of this queue
        System.out.println("Poll: " + priorityQueue.poll());

        // Displaying the PriorityQueue after poll
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // offer method: Inserts the specified element into this queue
        priorityQueue.offer(4);
        System.out.println("PriorityQueue after offer: " + priorityQueue);

        // size method: Returns the number of elements in this queue
        System.out.println("Size of PriorityQueue: " + priorityQueue.size());

        // isEmpty method: Returns true if this queue contains no elements
        System.out.println("Is PriorityQueue empty? " + priorityQueue.isEmpty());

        // clear method: Removes all of the elements from this queue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clear: " + priorityQueue);
    }
}
