package Lecture_2.binarytodecimal;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 101;

        int result = 0;
        int power=0;

        while (num > 0) {
            result += (num % 10) * (int) Math.pow(2, power++);
            num /= 10;
        }
        System.out.println("The result is: "+result);
    }
}