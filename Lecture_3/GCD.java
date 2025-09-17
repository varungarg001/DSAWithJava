package Lecture_3;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        greatestCommonDifference(num1, num2);
        scanner.close();
    }

    public static void greatestCommonDifference(int num1,int num2){
        int min = (num1 <= num2) ? num1 : num2;

        if (min == 0) {
            int ans = num1>=num2?num1:num2;
            System.out.println("GCD OF " + num1 + " and " + num2 + " " + "is " + ans);
            return;
        }

        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("GCD OF " + num1 + " and " + num2 + " " + "is " + min);
                return;
            }
            min--;
        }
    }
}
