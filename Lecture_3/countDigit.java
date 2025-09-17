package Lecture_3;

public class countDigit {
    public static void main(String[] args) {
        countdigit(456789);
        countdigitFromLog(456789);
    }

    public static void countdigit(int num) {
        if (num == 0) {
        System.out.println("The number of digit in the number is: 1");
        return;
        }
        int counter = 0;

        while (num > 0) {
            num /= 10;
            counter++;
        }
        System.out.println("The number of digit in the number is: " + counter);
    }
    
    public static void countdigitFromLog(int num) {
        if (num == 0) {
        System.out.println("The number of digit in the number is: 1");
        return;
    }
        int result = (int)Math.log10(num)+1;
        System.out.println("The result is: "+result);
    }
}
