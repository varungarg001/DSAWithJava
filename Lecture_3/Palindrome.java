package Lecture_3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int copyNum = num;
        int result=0;

        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        
        if (copyNum == result)
        {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not the palindrome");
        }
        scanner.close();
    }
}
