package Recursion.Problems;

import java.util.ArrayList;

public class PASWSIK {

    // PASWSIK - Print Any Subsequences whose sum is k

    static boolean printSubSequences(int index, int[] arr, ArrayList<Integer> arr1, int sum, int k) {
        
        if (index == arr.length) {
            if (sum == k) {
                for (int i : arr1) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        sum += arr[index];
        arr1.add(arr[index]);
        if (printSubSequences(index + 1, arr, arr1, sum, k)) {
            return true;
        }

        Integer n = arr[index];
        sum -= arr[index];
        arr1.remove(n);

        if (printSubSequences(index + 1, arr, arr1, sum, k)) {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 1 };


        printSubSequences(0, arr, new ArrayList<Integer>(), 0, 2);
    }
}
