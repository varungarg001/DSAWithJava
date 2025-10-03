package Collection.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.LinkedList;

public class DequeInterface {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();  // deque means double ended queue
        // Deque<Integer> linked = new LinkedList<>();

        deque.offer(10); // use to add element in the deque
        deque.offer(17);
        deque.offer(1);
        deque.offer(7);
        deque.offer(8);   // use to add element from the rear
        deque.offerLast(81);   // use to add element from the rear
        deque.offerFirst(45); // use to add element from the front

        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // System.out.println(deque.poll()); // it is use to remove the element from the front 
        System.out.println(deque.pollFirst()); // it is use to remove the element from the front         
        System.out.println(deque.pollLast()); // it is use to remove the element from the rear         

        
        System.out.println(deque);

    }
}
