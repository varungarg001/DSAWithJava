package Recursion;

public class Test {
    static void fun(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
        System.out.println("hello"+n);
    }
    public static void main(String[] args) {
        fun(10);
    }
}
