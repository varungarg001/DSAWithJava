package Collection.ListInterface;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        // operations
        stack.push(11);   // use to push element in the array - LIFO
        stack.push(1);
        stack.push(10);
        stack.push(20);

        System.out.println(stack);

        stack.pop(); // it is used to remove peek element
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
