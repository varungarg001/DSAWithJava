package Sorting.BubbleSort;

import Sorting.InsertionSort.Code;
import Sorting.SelectionSort.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1, 2, 4, 0 ,-1,-2,4,8,9,10};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    code.swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if(flag==false){
                break;
            }
        }
        Code.printLoop(arr);
    }
}
