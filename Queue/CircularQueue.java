package Queue;

public class CircularQueue {
    int rear;
    int front;
    int capacity;
    int size;
    int circularQueue[];

    public CircularQueue(int capacity) {
        circularQueue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == (capacity - 1)) {
            return true;
        } else if (front != 0 && rear == (front - 1)%(capacity)) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return circularQueue[front];
    }

    public int size() {
        return size;
    }

    public void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            rear = front = 0;
            circularQueue[rear] = value;
            size++;
            System.out.println("Item added to the queue");
            return;
        }

        if (rear == (capacity - 1) && front != 0) {
            rear = 0;
            circularQueue[rear] = value;
            size++;
            System.out.println("Item added to the queue");
            return;
        }
        circularQueue[++rear] = value;
        size++;
        System.out.println("Item added to the queue");
        return;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = circularQueue[front];

        if (front == rear) {
            front = rear = -1;
            size--;
        } else if (front == (capacity - 1)) {
            front = 0;
        }else {
            front++;
        }
        size--;
        return element;

    }

    public void printQueue() {
        System.out.println();

        if (rear < front) { // circular case

            for (int i = front; i < capacity; i++) {
                System.out.print(circularQueue[i] + " ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.println(circularQueue[i] + " ");
            }
            
        }else {   // normal case
            for(int i=front;i<rear;i++){
                System.out.println(circularQueue[i]+" ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        System.out.println(circularQueue.isEmpty());
        circularQueue.enqueue(4);
        circularQueue.enqueue(42);
        circularQueue.enqueue(41);
        circularQueue.enqueue(40);
        circularQueue.enqueue(47);

        System.out.println(circularQueue.dequeue());
        circularQueue.enqueue(10);
        circularQueue.printQueue();
    }
}
