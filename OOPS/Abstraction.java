package OOPS;

abstract class A {

    int a;

    A() {
        this.a = 14;
    }

    abstract void display();

    void print() {
        System.out.println(this.a);
    }
}

class B extends A {
    public B() {
        System.out.println("Constructor of parent is called");
    }

    @Override
    void display() {
        System.out.println("Method overriden");

    }
    
    void sayHello() {
        System.out.println("Hello ");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        A b = new B();
        b.display();
        b.print();
        // b.sayHello();
    }
}
