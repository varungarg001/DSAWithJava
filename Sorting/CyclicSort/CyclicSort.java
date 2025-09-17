package Sorting.CyclicSort;

import Sorting.InsertionSort.Code;
import Sorting.SelectionSort.code;

public class CyclicSort {
    // For range [1,N]
    public static void main(String[] args) {
        int[] arr = { 1, 2,9, 4, 3, 5 };
        cyclicSort(arr);
    }

    static void cyclicSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int actualPos = arr[index] - 1;
            if (arr[index] < arr.length && arr[actualPos] != arr[index] ) {
                code.swap(arr, index, actualPos);
            }else {
                index++;
            }
        }
        Code.printLoop(arr);
    }
}
