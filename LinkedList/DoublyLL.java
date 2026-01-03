package LinkedList;

public class DoublyLL<T> {

    private Node<T> head;
    private int size;
    private Node<T> tail;

    public DoublyLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertHead(T data) {
        Node<T> newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = head;
            size++;
            System.out.println("Node inserted ");
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;
        System.out.println("Node inserted ");
    }

    public void insertAtTail(T data) {
        Node<T> newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = head;
            size++;
            System.out.println("Node inserted ");
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;
        tail = newnode;
        size++;
        System.out.println("Node inserted ");
    }
    
    public void insertNode(T data, int position) {
        if (position <= 0 || position > size + 1) {
            System.out.println("Insertion cannot be possible");
            return;
        }

        if (position == 1) {
            insertHead(data);
            return;
        }

        if (position == (size + 1)) {
            insertAtTail(data);
            return;
        }

        int counter = 1;
        Node<T> newNode = new Node();
        Node<T> temp = head;

        while (counter < (position - 1) && temp != null) {
            counter++;
            temp = temp.next;
        }

        newNode.data = data;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;

        size++;
        System.out.println("Node inserted ");
    }
    
    public void deleteHead() {
        if (head == null) {
            System.out.println("Deletion cannot be possible");
            return;
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Node deleted successfully");
            size--;
            System.gc();
        } else {
            Node<T> temp = head;
            temp.next.prev = null;
            head = temp.next;
            temp.next = null;
            System.out.println("Deletion at head is successful");
            size--;

            System.gc();

        }
    }
    
    public void deleteTail() {
        if (head == null) {
            System.out.println("Deletion cannot be possible");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Deletion at head is successful");
            size--;
            System.gc();
        } else {
            Node<T> temp = tail;
            temp.prev.next = null;
            tail = temp.prev;
            temp.prev = null;
            System.out.println("Deletion at head is successful");
            size--;
            System.gc();

        }
    }

    public void deleteNode(int postion) {
        if (postion <= 0 || postion > (size)) {
            System.out.println("Deletion cannot be possible");
            return;
        }

        if (postion == 1) {
            deleteHead();
        } else if (postion == (size)) {
            deleteTail();
        } else {
            int counter = 1;
            Node<T> prevNode = null;
            Node<T> temp = head;
            
            while (counter < postion && temp != null) {
                counter++;
                prevNode = head;
                temp = temp.next;
            }
            
            prevNode.next = temp.next;
            temp.next.prev = prevNode;
            temp.next = null;
            temp.prev = null;
            size--;
            System.out.println("Deletion successfull");
            System.gc();
        }
    }
    
    public void updateValueByPosition(int postion, T updatedValue) {

        if (postion <= 0 || postion > size) {
            System.out.println("Updation cannot be possible");
            return;
        } else {
            int counter = 1;
            Node<T> temp = head;

            while (counter < postion && temp != null) {
                counter++;
                temp = temp.next;
            }

            temp.data = updatedValue;
            System.out.println("updation successfull");
        }
    }
    
    public boolean searchNode(T searchValued) {

        if (head == null) {
            System.out.println("Linked List is empty");
            return false;
        }
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data == searchValued) {
                System.out.println("Value found");
                return true;
            }
            temp = temp.next;

        }
        return false;
    }

    public void printList() {
        Node<T> temp = head;

        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printListReverse() {
        Node<T> temp = tail;

        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public int getSize() {
        return size;
    }



    public static void main(String[] args) {
        DoublyLL<Integer> ll = new DoublyLL<>();
        ll.insertHead(10);
        ll.insertAtTail(1);
        ll.insertNode(45, 1);
        ll.insertNode(48, 2);
        ll.printListReverse();
        System.out.println("---------------------------------------");
        ll.printList();
        System.out.println("---------------------------------------");
        System.out.println("Size of the Linked List is: " + ll.getSize());

        ll.deleteHead();
        System.out.println("---------------------------------------");
        System.out.println("Linked List after deletion at head");
        ll.printList();
        System.out.println("---------------------------------------");
        ll.deleteTail();
        ll.printList();

        ll.insertHead(63);

        System.out.println("---------------------------------------");
        System.out.println("Linked List before Deletion");
        ll.printList();
        ll.deleteNode(2);
        System.out.println("---------------------------------------");
        System.out.println("Linked List After deletion");
        ll.printList();

        ll.updateValueByPosition(2,100);
        ll.printList();

        System.out.println(ll.searchNode(100));
    }
    


}

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public Node() {
        this.prev = null;
        this.next = null;
    }
}
