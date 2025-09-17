package Lecture_4;

import java.util.Scanner;

public class PrintBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // printBits(num);
        reversedBits(num);
        System.out.println(Integer.reverse(num));
        scanner.close();
    }

    public static void printBits(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static void reversedBits(int num) {
        int sum=0;
        for (int i = 0; i < 32; i++) {
            sum <<= 1;
            sum = sum | ((num >> i) & 1);
        }
        System.out.println(sum);
    }
}
