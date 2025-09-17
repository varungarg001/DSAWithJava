package Sorting.Problems;

import Sorting.InsertionSort.Code;
import Sorting.SelectionSort.code;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
        alternateSorting(arr);
    }

    static void alternateSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    code.swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        int[] output = new int[arr.length];

        while (index<output.length) {
            output[index++] = arr[end];
            if (index == output.length) {
                break;
            }
            output[index++] = arr[start];
            start++;
            end--;

        }
        Code.printLoop(output);
    }
}
