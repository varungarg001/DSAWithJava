package Sorting.BrickSort;

import Sorting.InsertionSort.Code;
import Sorting.SelectionSort.code;

public class BrickSort {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1, 2, 4, 0,45,0,1,3 };
        brickSort(arr);
    }

    static void brickSort(int[] arr) {
        boolean isSorted = true;

        while (isSorted) {
            boolean flag = false;
            //for even index

            for (int i = 0; i < arr.length - 1; i += 2) {

                if (arr[i] > arr[i + 1]) {
                    code.swap(arr, i, i + 1);
                    flag = true;
                }
            }

            // for odd index

            for (int i = 1; i < arr.length - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    code.swap(arr, i, i + 1);
                    flag = true;
                }
            }

            if (!flag) {
                isSorted = false;
            }
        }
        Code.printLoop(arr);
    }
}
