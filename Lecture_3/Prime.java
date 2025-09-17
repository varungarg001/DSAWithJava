package Lecture_3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int counter = 2;
        while (counter <= Math.sqrt(num)) {
            if (num % counter == 0) {
                System.out.println(num + " is not a prime number ");
                scanner.close();
                return;
            }
            counter++;
        }
        System.out.println(num + " is a prime number ");
        scanner.close();
    }
}
