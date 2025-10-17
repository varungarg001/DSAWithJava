package OOPS;

class Outer{
    public static int rollNumber;
    String name;

    Outer() {
        rollNumber = 10;
        this.name = "hello";
    }

    void display() {
        System.out.println("The rollnumber in outer class "+rollNumber);
        System.out.println("The name in outer class "+this.name);
    }

    class Inner {
        public static int rollNumber;
        String name;

        Inner() {
            rollNumber = 20;
            this.name = "hello inner";
        }

        void display() {
            System.out
                    .println("the rollnumber in outer class and we are accessing from inner class " + Outer.rollNumber); // because rollnumber is static
            System.out.println("The rollnumber in inner class "+rollNumber);
            System.out.println("The name in outer class "+Outer.this.name);
            System.out.println("The name in inner class "+this.name);
            
            
        }
    }
}

public class NestedClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        
        inner.display();
        outer.display();
    }
    
}