package OOPS;

abstract class Bank {

    Bank() {
        System.out.println("This is the constructor");
    }

    abstract int rateOfInterest();

    void display() {
        System.out.println("Welcome to our Bank");
    }
}

class PNB extends Bank {

    @Override
    int rateOfInterest() {
        return 10;
    }
}

class SBI extends Bank {

    @Override
    int rateOfInterest() {
        return 11;
    }
}

abstract class HDFC extends Bank {

    void print() {
        System.out.println("Hi HDFC");
    }
}

class NewBank extends HDFC{
    int rateOfInterest() {
        return 7;
    }
}

public class Main {
    public static void main(String[] args) {
        PNB pnb = new PNB();
        System.out.println(pnb.rateOfInterest());
    }
}
