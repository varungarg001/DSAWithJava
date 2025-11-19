package Recursion.Problems;

public class ReverseAnArray {

    public static int[] reverse(int[] arr, int l, int r) {
        if (l == r) {
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return reverse(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2 };

        int[] ans = reverse(arr, 0, (arr.length - 1));

        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
