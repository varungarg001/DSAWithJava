package Stack;

public class ImplementationOfStack {

    int stack[];
    int top;
    int size;

    public ImplementationOfStack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    // Insertion in the stack

    public void push(int value) {
        if (top >= (size - 1)) {
            System.out.println("Stack is full, no place to insert new element ");
            return;
        }
        stack[++top] = value;
    }

    // Deletion of element from top
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty ");
            return Integer.MIN_VALUE;
        }
        int element = stack[top--];
        return element;
    }

    // peak element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, so there is no top element ");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public int size() {
        return top + 1;
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("There's nothing to display ");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementationOfStack myStack = new ImplementationOfStack(20);
        myStack.push(10);
        myStack.push(10);
        myStack.displayStack();
        myStack.pop();
        myStack.push(14);
        myStack.push(15);
        myStack.push(2);
        myStack.pop();
        myStack.displayStack();
        int peekElement = myStack.peek();
        System.out.println("peak element is: " + peekElement);

        int size = myStack.size();
        System.out.println("size of the stack is: " + size);

        boolean isEmpty = myStack.isEmpty();
        System.out.println(isEmpty);

        // hello<String> str = new hello<>();
        // str.setNumber("hello");
        // System.out.println(str.getNumber());

        // hello<Integer> num = new hello<>();
        // num.setNumber(10);
        // System.out.println(num.getNumber());

    }
}

// class hello<T> {
//     private T value;

//     public T getNumber() {
//         return value;
//     }

//     public void setNumber(T value) {
//         this.value = value;
//     }
    
// }
