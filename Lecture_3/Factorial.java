package Lecture_3;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int res = 1;
        while (num > 0) {
            res *= num;
            num--;
        }
        System.out.println("The Factorial is: "+res);
    }
}
