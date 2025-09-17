package Lecture_3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int numDuplicate = num;

        while (num > 0) {
            result += Math.pow(num % 10, 3);
            num /= 10;
        }
        if (result == numDuplicate) {
            System.out.println("The number is armstrong number");
        } else {
            System.out.println("The number is not the armstrong number");
        }
        sc.close();
    }
}
