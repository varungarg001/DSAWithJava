package Queue;

public class DEQueue {
    int front;
    int rear;
    int capacity;
    int size;
    int[] deQueue;

    public DEQueue(int capacity) {
        deQueue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((front == 0 && rear == (capacity - 1)) || (front != 0 && rear == (front - 1))) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int peekFirst() {
        return deQueue[front];
    }

    public int peekLast() {
        return deQueue[rear];
    }

    public void enqueueFront(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            deQueue[front] = value;
            size++;
            System.out.println("Item added Successfully");
            return;
        } else if (front == 0 && rear != capacity - 1) {
            front = capacity - 1;
        } else {
            front--;
        }
        deQueue[front] = value;
        size++;
        System.out.println("Item added Successfully");
    }

    public void enqueueRear(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            deQueue[rear] = value;
            size++;
            System.out.println("Item added Successfully");
            return;
        } else if (front != 0 && rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        deQueue[rear] = value;
        size++;
        System.out.println("Item added Successfully");
    }
    
    public int dequeueFront() throws QueueEmpty {
        
        if (isEmpty()) {
            throw new QueueEmpty("hello,Queue is Empty");
        }

        int element = deQueue[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return element;
    }
    
    public int dequeueRear() throws QueueEmpty {
        if (isEmpty()) {
            throw new QueueEmpty("hello,Queue is Empty");
        }

        int element = deQueue[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return element;
    }

    public void printQueue() {

        if (rear < front) { // circular case

            for (int i = front; i < capacity; i++) {
                System.out.print(deQueue[i] + " ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(deQueue[i] + " ");
            }

        } else { // normal case
            for (int i = front; i < rear; i++) {
                System.out.println(deQueue[i] + " ");
            }
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
        try {
            DEQueue queue = new DEQueue(5);
            System.out.println(queue.isEmpty());

            // queue.dequeueFront();

            queue.enqueueFront(10);
            queue.enqueueFront(1);
            queue.enqueueFront(40);
            queue.enqueueFront(7);
            queue.enqueueFront(11);
            queue.enqueueFront(0);

            queue.printQueue();
            System.out.println(queue.dequeueFront());
            queue.enqueueRear(47);
            queue.printQueue();
            System.out.println(queue.peekLast());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
