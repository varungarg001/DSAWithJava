package OOPS;

interface Greeting {

    void display();
}

public class AnnoymsClass {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            
            public void display() {
                System.out.println("Greets Everbody");
            }
        };

        greeting.display();
        
    }
}
