package Lecture_4;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 32;
        System.out.print("Number before bit set: ");
        printBits(num);

        int bit = 0;

        int res = setBit(num, bit);
        System.out.print("Number after bit set the "+bit+" bit"+":" );
        printBits(res);

    }

    public static int setBit(int num, int bit) {
        return (num | (1 << bit));
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
}
