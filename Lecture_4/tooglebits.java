package Lecture_4;

public class tooglebits {
    public static void main(String[] args) {
        int num = 12;
        int k = 2;
        int count = 1;

        for (int i = 0; i < k; i++) {
            num = (num ^ (1 << (count-1)));
            count++;
        }
        System.out.println(num);
    }
}
