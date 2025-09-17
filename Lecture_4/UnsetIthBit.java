package Lecture_4;

public class UnsetIthBit {
    public static void main(String[] args) {
        int num = 15;
        int bit = 1;

        System.out.print("Bits before toggle the ith bit: ");
        printBits(num);

        int result = unsetBit(num, bit);
        System.out.print("Bits after toggle the " + bit + " bit: ");
        printBits(result);
    }

    public static int unsetBit(int num, int bit) {
        return (num & ~(1 << bit));
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
}
