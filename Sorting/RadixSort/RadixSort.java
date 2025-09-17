package Sorting.RadixSort;

import Sorting.InsertionSort.Code;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = { 603, 202, 400, 1, 4, 7, 0,47,556,9874 };

        radixSort(arr);
    }

    static void radixSort(int[] arr) {
        // finding maximum element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // finding number of digit and apply counting sort
        for (int digit = 1; (max / digit) > 0; digit *= 10) {
            countingSortOnDigit(arr, digit);
        }
        Code.printLoop(arr);
    }

    static void countingSortOnDigit(int[] arr, int digit) {
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int index = (arr[i] / digit) % 10;
            count[index]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int index = --count[(val / digit) % 10];
            output[index] = val;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
