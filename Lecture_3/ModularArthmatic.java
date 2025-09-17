package Lecture_3;

import java.util.Scanner;

public class ModularArthmatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        System.out.println();
        int num2 = scanner.nextInt();
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();

        fastExponential(num1, num2,limit);

        scanner.close();
    }

    public static void fastExponential(long value, long power,long limit) {
        // ((a mod m) * (b mod m)) mod m = ((a*b) mod m)
        // this method is use where we have to calculate power of a number and we want it in a particular range

        long res = 1;

        while (power > 0) {
            if (value % 2 != 0) {
                res = ((value % limit) * (res % limit)) % limit;
                power--;
            }
            power /= 2;

            value = ((value % limit) * (value % limit)) % limit;
        }
        System.out.println("The result is: "+res);


    }
}
