package Sorting.SelectionSort;

import Sorting.InsertionSort.Code;

public class code {

    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1, 2, 4, 0 };
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minindex = j;
                }
            }
            swap(arr, minindex, i);

        }
        Code.printLoop(arr);

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}