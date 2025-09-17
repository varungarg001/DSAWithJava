package Sorting.CyclicSort;

import Sorting.InsertionSort.Code;
import Sorting.SelectionSort.code;

public class CyclicSortII {
    // For range [0,N]
    public static void main(String[] args) {
        int[] arr = { 1, 2, 9, 4, 3, 5,0 };
        cyclicSortII(arr);
    }

    static void cyclicSortII(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int actualPos = arr[index];
            if (arr[index] < arr.length && arr[actualPos] != arr[index]) {
                code.swap(arr, index, actualPos);
            } else {
                index++;
            }
        }
        Code.printLoop(arr);
    }
}
