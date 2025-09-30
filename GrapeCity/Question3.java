package GrapeCity;

public class Question3 {
    // GCD of array elements. 
    public static void main(String[] args) {
        int[] arr = { 4,6,8,12,15 };
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp = gcd(temp, arr[i]);
        }
        System.out.println("The gcd of given elements are: " + temp);

    }

    static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a >= b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return (a == 0 ? b : a);
    }
}
