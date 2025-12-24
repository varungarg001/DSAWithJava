package LinkedList;

// import org.w3c.dom.Node;

public class ImplementionLL {
    Node<Integer> head;
    int size;

    public ImplementionLL() {
        this.head = null;
        this.size = 0;
    }

    public void insertNode(int data, int postion) {

        if (postion > size + 1 || postion <= 0) {
            System.out.println("It is not possible");
            return;
        }

        if (postion == 1) {
            insertHead(data);
            return;
        }

        if (postion == size + 1) {
            insertEnd(data);
            return;
        }

        Node<Integer> newNode = new Node<>(data);
        int counter = 1;
        Node<Integer> temp = head;

        while (counter < (postion - 1) && (temp != null)) {
            counter++;
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        System.out.println("Insertion is done at particular postion is done");
    }
    
    public void insertHead(int data) {

        Node<Integer> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            size++;
            System.out.println("Insertion at the head is done");
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Insertion at the head is done");
    }
    
    public void insertEnd(int data) {
        Node<Integer> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            size++;
            System.out.println("Insertion at the tail is done");
            size++;
            return;
        }

        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;

        System.out.println("Insertion at the tail is done");
    }

    public void insertNode(int data) {
        
        if (head == null) {
            insertHead(data);
            System.out.println("Insertion is done");
            return;
        }

        Node<Integer> newNode = new Node<>(data);
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;

        System.out.println("Insertion is done");

    }

    public void deleteHeadNode() {
        if (head == null) {
            System.out.println("There is no data to delete");
            return;
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Deletion is successfull");
            System.gc();
        } else {
            Node<Integer> temp = head;
            head = temp.next;
            temp.next = null;
            size--;
            System.out.println("Deletion is successfull");
            System.gc();
        }
    }

    public void deleteAtLast() {
        
        if (head == null) {
            System.out.println("There is no data to delete");
            return;
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Deletion is successfull");
            System.gc();
        } else {
            Node<Integer> prev = null;
            Node<Integer> temp = head;

            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = null;
            size--;
            System.out.println("Deletion is successfull");
            System.gc();
        }
    }

    public void delete(int pos) {

        if (pos <= 0 || pos > size) {
            System.out.println("Deletion cannot be possible");
            return;
        }

        if (pos == 1) {
            deleteHeadNode();
            return;
        } else if (pos == size) {
            deleteAtLast();
            return;
        } else {
            Node<Integer> prev = null;
            Node<Integer> temp = head;

            int counter = 1;

            while (counter < pos && temp != null) {
                counter++;
                prev = temp;
                temp = temp.next;
            }

            prev.next = temp.next;
            temp.next = null;
            size--;
            System.out.println("Deletion is successful");
            System.gc();
        }
    }
    
    public void updateNode(int pos, int data) {
        if (pos <= 0 || pos > size) {
            System.out.println("It is not possible");
            return;
        }
        if (head == null) {
            System.out.println("There is no data to update");
            return;
        } else {
            int counter = 1;
            Node<Integer> temp = head;
            while (counter < pos && temp != null) {
                counter++;
                temp = temp.next;
            }
            temp.data = data;
            System.out.println("updated successfully");
        }
    }
    
    public boolean searchNode(int data) {
        return findNode(data);
    }

    private boolean findNode(int data) {
        if (head == null) {
            return false;
        } else {
            Node<Integer> temp = head;
            while (temp.next != null) {
                if (temp.data == data) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    
    void printList() {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ImplementionLL l1 = new ImplementionLL();

        l1.insertNode(10);

        l1.printList();

        l1.insertHead(220);
        l1.printList();

        l1.insertEnd(45);
        l1.printList();

        l1.insertNode(789, 2);
        l1.insertNode(78, 1);
        l1.insertNode(7, 6);
        l1.insertNode(67, 2);
        l1.insertNode(456, 8);
        l1.printList();

        l1.deleteHeadNode();
        l1.printList();
        l1.deleteAtLast();
        l1.printList();
        l1.delete(3);
        l1.printList();

        l1.updateNode(4, 11);
        l1.printList();

        System.out.println(l1.findNode(10));
    }
}


class Node<T> {
    T data;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(T data) {
        this.data = data;
    }
}