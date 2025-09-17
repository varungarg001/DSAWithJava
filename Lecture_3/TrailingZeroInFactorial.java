package Lecture_3;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        int num = 300;

        int res = 0;
        for (int i = 5; i <= num; i = i * i) {
            res += num / i;
        }
        System.out.println(res);
    }
}
