package OOPS;


interface Shape {
    String name = "interface";

    void display();

    void calculateArea();

    private void greetUser() {
        System.out.println("Welcome user");
    }

    default void printSome() {
        System.out.println("Welcome user");
    }

    static void printName() {
        System.out.println("Hi user, " + name);
    }

}

class Circle implements Shape {
    int radius;
    Circle() {
        this.radius = 10;
    }

    private final double pi = 3.14;
    
    public void display() {
        System.out.println("Shape is circle");
    }
    
    public void calculateArea() {
        System.out.println("The area of the circle is "+(radius*radius*pi));
    }
}

public class MyInterface {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.display();
        circle.printSome();

        Shape shape = new Circle();

        shape.display();
    }
}
