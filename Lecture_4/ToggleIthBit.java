package Lecture_4;

public class ToggleIthBit {
    public static void main(String[] args) {
        int num = 32;
        int bit = 5;

        System.out.print("Bits before toggle the ith bit: ");
        printBits(num);

        int result = toggleBit(num, bit);
        System.out.print("Bits after toggle the " + bit + " bit: ");
        printBits(result);
    }
    
    public static int toggleBit(int num, int bit) {
        return (num ^ (1 << bit));
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
}
