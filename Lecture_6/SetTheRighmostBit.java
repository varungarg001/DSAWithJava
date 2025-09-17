package Lecture_6;

public class SetTheRighmostBit {
    public static void main(String[] args) {
        int num = 49971;
        printBinary(num);

        setBit(num);

    }

    public static void printBinary(int num) {
        for (int i = 16; i >= 0; i--) {
            System.out.print(num >> i & (1));

        }
        System.out.println();
    }

    public static void setBit(int num) {
        int count=0;
        while (num != 0) {
            // num >> count & 1;
            if ((num >> count & 1) == 0) {
                num = num | (1 << count);
                // printBinary(num);
                break;
            }
            count++;
        }
        System.out.println(num);
    }
}

