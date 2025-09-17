package Lecture_4;

public class CountNumberOfSetBit {
    public static void main(String[] args) {
        int num = 32;
        ToggleIthBit.printBits(num);

        int result = countSetBit(num);
        System.out.println(result);
    }

    public static int countSetBit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = UnsetTheRightMostBit.unsetRightMostBit(num);
        }
        return count;
    }
}
