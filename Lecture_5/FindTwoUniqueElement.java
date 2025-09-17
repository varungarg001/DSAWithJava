package Lecture_5;

public class FindTwoUniqueElement {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 1, 6 };
        findUnique(arr);
    }

    public static void findUnique(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        int bit = 0;
        int setbit = 0;

        while (res != 0) {
            if (((res >> bit) & 1) != 0) {
                setbit = bit;
                break;
            }
            bit++;

        }

        int res1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (((arr[i] >> setbit) & 1) != 0) {
                res1 ^= arr[i];
            }
        }
        int a = res1 ^ res;
        int b = a ^ res;
        System.out.println(a+","+b);
    }
}
