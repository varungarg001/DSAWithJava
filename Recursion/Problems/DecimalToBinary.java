package Recursion.Problems;

public class DecimalToBinary {
    static String decimalToBinaryUsingRecursion(int num) {
        if (num <= 0) {
            return "";
        }

        String res = decimalToBinaryUsingRecursion(num / 2)+String.valueOf(num % 2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinaryUsingRecursion(11));
    }
}
