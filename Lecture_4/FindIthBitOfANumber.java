package Lecture_4;

import java.util.Scanner;

public class FindIthBitOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the which bit of the number you want: ");
        int bit = scanner.nextInt();

        ithBit(num,bit);
        scanner.close();
    }

    public static void ithBit(int num,int bit) {
        System.out.println((num>>(bit))&1);
    }
}
