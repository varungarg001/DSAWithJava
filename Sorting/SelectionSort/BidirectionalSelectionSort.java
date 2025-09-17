package Sorting.SelectionSort;

import Sorting.InsertionSort.Code;

public class BidirectionalSelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1, 2, 4, 0,-1 };
        biDirectionalSorting(arr);
    }

    static void biDirectionalSorting(int[] arr) {
        int n=arr.length;
        int k=n-1;
        for (int i = 0; i < k; i++) {
            int minElement = arr[i];
            int minIndex = i;
            int maxElement = arr[i];
            int maxIndex = i;

            for (int j = i + 1; j <= k; j++) {
                if (arr[j] <= minElement) {
                    minElement = arr[j];
                    minIndex = j;
                }
                if (arr[j] > maxElement) {
                    maxElement = arr[j];
                    maxIndex = j;
                }
            }
            code.swap(arr, minIndex, i);
            if (maxElement == arr[minIndex]) {
                code.swap(arr, k, minIndex);
            } else {
                
                code.swap(arr, maxIndex, k);
            }
            k--;
        }
        Code.printLoop(arr);
    }
}
