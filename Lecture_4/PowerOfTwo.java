package Lecture_4;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 32;
        int result = num & (num - 1);

        if (result==0) {
            System.out.println("number is power of two");
        } else {
            System.out.println("number is not power of two");
        }
    }
}
