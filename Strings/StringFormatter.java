package Strings;

public class StringFormatter {
    public static void main(String[] args) {
        double num = 45.1257987;
        System.out.println(num);

        System.out.printf("number is: %.3f", num);
        System.out.println();

        String name = String.format("number is: %.3f", num);
        System.out.println(name);
    }
}
