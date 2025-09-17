package Lecture_3;

import java.util.Scanner;

public class Divisior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter=1;

        while (counter <= Math.sqrt(num)) {
            if (num % counter == 0) {
                System.out.println("The divisor of the number is: " + counter);
                if (counter != (num / counter))
                    System.out.println("The divisor of the number is: " + num / counter);
            }
            counter++;
        }
        scanner.close();
    }
}
