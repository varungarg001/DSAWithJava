package Lecture_2.decimaltoanybase03;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the conversion and it must be from 2-9 : ");
        int base = scanner.nextInt();

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int result = 0;
        int power = 0;

        while (number > 0) {
            result += (number % base) * (int) Math.pow(10, power++);
            number /= base;
        }

        System.out.println("The result after the conversion of a value of base 10 to base "+base+" is "+result);
        scanner.close();
    }}
