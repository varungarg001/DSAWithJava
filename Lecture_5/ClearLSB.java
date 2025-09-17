package Lecture_5;

import Lecture_4.ToggleIthBit;

public class ClearLSB {
    public static void main(String[] args) {
        int num = 31;
        int bit = 3;
        ToggleIthBit.printBits(num);

        int result = clearLSB(num, bit);
        ToggleIthBit.printBits(result);
    }

    public static int clearLSB(int num, int bit) {
        return num & ~((1 << (bit+1)) - 1);
    }
}