package OOPS;

// Single level inheritance  A<--B

// inheritance -> is A relationship

class Terminator1 {
    String pname;
    int page;

    public void displayParent() {
        System.out.println("Parent name is: " + pname);
        displayAge();
    }


    // data hiding
    private void displayAge() {
        System.out.println("Parent age is: " + page);
    }
}

class Child extends Terminator1 {
    String cname;
    int cage;

    public void displayChild() {
        System.out.println("child name is: "+cname);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Terminator1 t1 = new Terminator1();
        t1.pname = "varun";
        t1.displayParent();

        Child c1 = new Child();
        c1.displayChild();
        c1.displayParent();
    }
}

// multilevel inheritance -> A<-B<-C
// hierachy A->b,A->c