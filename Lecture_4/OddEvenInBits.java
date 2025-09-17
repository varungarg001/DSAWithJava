package Lecture_4;

import java.util.Scanner;

public class OddEvenInBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        oddEven(num);
        scanner.close();
    }

    public static void oddEven(int num) {
        int result = num & 1;
        if (result==1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
