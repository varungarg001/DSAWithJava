package Queue;

public class QueueUsingStack {

    stack stack1;
    stack stack2;

    public QueueUsingStack(int capacity) {
        this.stack1 = new stack(capacity);
        this.stack2 = new stack(capacity);
    }

    public void enqueue(int val) {
        stack1.push(val);
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            throw new QueueEmpty("Queue is empty");
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int element = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return element;
    }
    
    public int peek() {
        if (stack1.isEmpty()) {
            throw new QueueEmpty("Queue is Empty");
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int element = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return element;
    }

    public void printQueue() {
        if (stack1.isEmpty()) {
            throw new QueueEmpty("Queue is Empty");
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.peek() + " ");
            stack1.push(stack2.pop());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack(5);
        queue.enqueue(45);
        queue.enqueue(4);
        queue.enqueue(10);
        
        queue.printQueue();
        queue.dequeue();
        queue.enqueue(11);
        queue.printQueue();

        System.out.println(queue.peek());

    }

    
    

}

class stack {
    int top;
    int capacity;
    int size;
    int[] stackArr;

    public stack(int capacity) {
        stackArr = new int[capacity];
        top = -1;
        size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            throw new QueueEmpty("Queue is empty");
        }
        return stackArr[top];
    }

    public int getSize() {
        return size;
    }

    public void push(int value) {
        if (isFull()) {
            throw new QueueFull("Queue is Full");
        }

        if (isEmpty()) {
            top = 0;
            stackArr[top] = value;
            size++;
            return;
        }

        stackArr[++top] = value;
        size++;
        return;

    }

    public int pop() {
        if (isEmpty()) {
            throw new QueueEmpty("Queue is Empty");
        }
        int element = stackArr[top];
        top--;
        size--;
        return element;
    }
}
