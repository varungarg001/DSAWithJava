package Recursion.Problems;

import java.util.ArrayList;

public class PSWSIK {
    // PSWSIK == Print All Subsequences Whose Sum Is K

    static void printSubSequences(int index, int[] arr, ArrayList<Integer> arr1, int sum, int k) {

        if (index == arr.length) {
            if (sum == k) {
                for (int i : arr1) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }
            return;
        }

        arr1.add(arr[index]);
        sum += arr[index];
        printSubSequences(index + 1, arr, arr1, sum, k);

        sum -= arr[index];
        Integer n = arr[index];
        arr1.remove(n);
        printSubSequences(index + 1, arr, arr1, sum, k);
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 1 };


        printSubSequences(0, arr, new ArrayList<Integer>(), 0, 2);
    }
}
