package Lecture_5;

public class UniqueNumberInArray {
    public static void main(String[] args) {
        int[] num = { 1, 4, 7, 8, 9, 1, 7, 8 ,9};

        findUnique(num);

    }

    public static void findUnique(int[] num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res ^= num[i];
        }
        System.out.println("Unique number is: "+res);
    }
}
