package Lecture_2.reversenumber01;
import java.util.Scanner;

public class ReverseofaNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse: ");
        int num = scanner.nextInt();

        int result = 0;
       

        while (num > 0) {
            
            result = (int)num % 10 + (result * 10);
        
            num /= 10;
        }
        System.out.println("The reverse of the given number is: "+result);
        scanner.close();
    }
}