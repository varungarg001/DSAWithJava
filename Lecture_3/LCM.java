package Lecture_3;

import java.util.Scanner;

//  Least common factor
// lcm(a,b) * gcd(a,b) = a*b
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        leastCommonFactor(num1, num2);
        scanner.close();
    }

    public static void leastCommonFactor(int num1, int num2) {
        int gcd = GCD(num1, num2);

        System.out.println("Least common factor is: "+(num1*num2)/gcd);
    }
    
    public static int GCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        if (num1 == 0) {
            return num2;
        } else {
            return num1;
        }
    }
}
