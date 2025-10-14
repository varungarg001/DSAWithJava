package Queue;

public class StackUsingQueue {

    queue queue1;
    queue queue2;

    public StackUsingQueue(int capacity) {
        queue1 = new queue(capacity);
        queue2 = new queue(capacity);
    }
    
    public void push(int val) {
        if (queue1.isFull()) {
            throw new StackFull("stack is Full");
        }

        if (queue1.isEmpty()) {
            queue1.enqueue(val);
            return;
        }

        while (!queue1.isEmpty()) {
            queue2.enqueue(queue1.dequeue());
        }

        queue1.enqueue(val);

        while (!queue2.isEmpty()) {
            queue1.enqueue(queue2.dequeue());
        }

    }

    public int peek() {
        if (queue1.isEmpty()) {
            throw new StackEmpty("Stack is Empty");
        }
        return queue1.peek();
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new StackEmpty("Stack is Empty");
        }
        return queue1.dequeue();
    }

    public void printStack() {
        if (queue1.isEmpty()) {
            throw new StackEmpty("Stack is Empty");
        }

        for (int i = queue1.getFront(); i <= queue1.getRear(); i++) {
            System.out.print(queue1.getValue(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue(5);
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(0);
        stack.push(4);
        System.out.println("peek is: "+stack.peek());
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}

class queue {
    int rear;
    int front;
    int capacity;
    int size;
    int[] queueArr;

    public queue(int capacity) {
        queueArr = new int[capacity];
        this.capacity = capacity;
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((rear == capacity - 1)) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            throw new StackEmpty("Stack is Empty");
        }
        return queueArr[front];
    }

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getValue(int index) {
        if (index < 0 || index >= capacity) {
            System.out.println("Invalid");
            return -1;
        }
        return queueArr[index];
    }

    public void enqueue(int val) {
        if (isFull()) {
            throw new StackFull("Stack is Full");
        }

        if (isEmpty()) {
            rear = front = 0;
            queueArr[rear] = val;
            size++;
            return;
        }
        queueArr[++rear] = val;
        size++;
        return;
    }

    public int dequeue(){
        if (isEmpty()) {
            throw new StackEmpty("Stack is Empty");
        }
        int element = queueArr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        size--;
        return element;
    }
}
