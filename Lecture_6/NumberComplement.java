package Lecture_6;

public class NumberComplement {
    public static void main(String[] args) {
        int num = 5;

        // int ans = 0;

        // for (int i = 0; i < 32; i++) {
        //     if (((num) & 1 << i) == 1) {
        //         ans = (num & ~(1 << i));
        //     } else {
        //         ans = (num | (1 << i));
        //     }
        // }
        System.out.println((~num));
    }
}
