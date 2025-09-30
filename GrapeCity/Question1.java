package GrapeCity;

import Sorting.InsertionSort.Code;
import Sorting.SelectionSort.code;

public class Question1 {
// given an integer 'k', the first k element in array must be sorted in 
// increasing order and after k in decreasing order.
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 4, 8, 1, 9 };
        int k = 4;
        sorted(arr, k);
        Code.printLoop(arr);
    }

    static void sorted(int[] arr, int k) {
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    code.swap(arr, j, j + 1);
                }
            }
        }

        for (int i = k; i < arr.length-1; i++) {
            for (int j = k; j < arr.length - 1 ; j++) {
                if (arr[j] < arr[j + 1]) {
                    code.swap(arr, j, j + 1);
                }
            }
        }
        
    }
}
