package Lecture_5;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println("Before Swapping");
        System.out.print("a = "+a);
        System.out.print(" b = " + b);
        System.out.println();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping ");
        System.out.print("a = "+a);
        System.out.print(" b = " + b);
        System.out.println();
        
    }
}
