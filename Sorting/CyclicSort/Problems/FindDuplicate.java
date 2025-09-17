package Sorting.CyclicSort.Problems;

import Sorting.SelectionSort.code;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 3 };
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    static int findDuplicate(int[] arr) {
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return 0;
    }

    static void cyclicSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int actualPos = arr[index] - 1;
            if (arr[actualPos] != arr[index]) {
                code.swap(arr, actualPos, index);
            } else {
                index++;
            }
        }
    }
}

