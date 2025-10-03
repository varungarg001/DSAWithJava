package Collection.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        // Queue works on the priciple of FIFO

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10); // use to add element in the queue
        queue.offer(17);
        queue.offer(1);
        queue.offer(7);
        queue.offer(8);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll()); // it is use to remove the element from the back 
        
        System.out.println(queue);
    }
}
