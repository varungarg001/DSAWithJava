package Lecture_6;

public class MinimumNumberOfFlip {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;

        minimumFlip(start, goal);
    }

    public static void minimumFlip(int start, int goal) {
        int count = 0;

        int ans = start ^ goal;

        // to get answer need to count number of set bit
        while (ans != 0) {
            ans = unsetRightmost(ans);
            count++;
        }
        System.out.println(count);
    }
    
    public static int unsetRightmost(int num) {
        return num & (num - 1);
    }
}
