package Lecture_3;
// this algo is use to find the gcd of two number and it is faster than the brute force method

import java.util.Scanner;

public class Euclidian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // euclidianAlgo(num1, num2);
        euclidianEfficientAlgo(num1, num2);
        scanner.close();
    }

    public static void euclidianAlgo(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        if (num1 == 0) {
            System.out.println("The GCD is: " + num2);
            return;
        } else {
            System.out.println("The GCD is: " + num1);
            return;
        }
    }
    
    public static void euclidianEfficientAlgo(int num1, int num2) {
        
        
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        if (num1 == 0) {
            System.out.println("The GCD is: " + num2);
            return;
        } else {
            System.out.println("The GCD is: " + num1);
            return;
        }
    }
}
