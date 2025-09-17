package Lecture_4;

public class UnsetTheRightMostBit {
    public static void main(String[] args) {
        int num = 31;
        ToggleIthBit.printBits(num);

        int result = unsetRightMostBit(num);
        ToggleIthBit.printBits(result);
    }

    public static int unsetRightMostBit(int num) {
        return num & (num - 1);
    }
}
