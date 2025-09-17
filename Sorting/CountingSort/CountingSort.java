package Sorting.CountingSort;

import Sorting.InsertionSort.Code;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1, 2, 4, 0, 45, 0, 1, 3 };
        countingSort(arr);
    }
    
    static void countingSort(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int n=arr.length;

        // find max element
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        int[] count = new int[maxElement + 1];
        
        // find frequency
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // find cummulative frequeny
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

        // output of the algo
        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            int index = --count[val];
            output[index] = val;
        }
        Code.printLoop(output);
    }
}