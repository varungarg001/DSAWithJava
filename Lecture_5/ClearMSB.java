package Lecture_5;

import Lecture_4.ToggleIthBit;

public class ClearMSB {
    public static void main(String[] args) {
        int num = 31;
        int bit = 2;
        ToggleIthBit.printBits(num);

        int result = clearMSB(num, bit);
        ToggleIthBit.printBits(result);
    }

    public static int clearMSB(int num, int bit) {
        return num & ((1 << (bit ) - 1));
    }
}
