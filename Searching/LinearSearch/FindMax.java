package Searching.LinearSearch;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 5, 8, 9, 4, 0 };

        findMax(arr);
    }

    public static void findMax(int[] arr) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        System.out.println("So the maximum value in the array is: "+ans);
    }
}
