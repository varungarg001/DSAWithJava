package Queue;

// implementation of queue using arrays

public class ImplQueue {

    int rear;
    int front;
    int size;
    int capacity;
    int queue[];

    public ImplQueue(int capacity) {
        queue = new int[capacity];
        this.capacity = capacity;
        rear = -1;
        front = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if (rear == (capacity - 1)) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public void enqueue(int value) {
        if (isEmpty()) {
            front = rear = 0;
            queue[rear] = value;
            size++;
            System.out.println("Item added to the queue");
            return;
        }

        if (isFull()) {
            System.out.println("Queue is full ");
            return;
        }

        queue[++rear] = value;
        size++;
        System.out.println("Item added to the queue");
        return;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = queue[front];
        size--;

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        return element;
    }
    
    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        return;
    }

    
    
    public static void main(String[] args) {
        ImplQueue myQueue = new ImplQueue(5);
        myQueue.enqueue(45);
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(10);
        myQueue.enqueue(10);
        myQueue.enqueue(10);
        System.out.println("Peek element will be: " + myQueue.peek());
        System.out.println("deleted element is: "+myQueue.dequeue());
        System.out.println("Peek element will be: "+myQueue.peek());
        System.out.println(myQueue.isEmpty());
        myQueue.printQueue();
    }
}
