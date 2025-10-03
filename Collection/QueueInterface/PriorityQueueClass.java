package Collection.QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();   // implement using min heap
        // Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());   // implement using max heap

        // operations
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(17);
        priorityQueue.offer(5);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue);
    }
}
