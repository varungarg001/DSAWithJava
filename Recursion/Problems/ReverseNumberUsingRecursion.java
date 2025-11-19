package Recursion.Problems;

public class ReverseNumberUsingRecursion {
    static String reverseNumber(int num) {

        if (num <= 0) {
            return "";
        }

        return String.valueOf(num % 10) + reverseNumber(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(14020));
    }
}
