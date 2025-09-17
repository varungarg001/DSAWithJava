package Sorting.PigeonHoleSort;

import Sorting.InsertionSort.Code;

public class PigeonHoleSort {
    public static void main(String[] args) {
        int[] arr = { 24, 28, 29, 21, 22, 24, 20 };
        pigeoholeSort(arr);
    }

    static void pigeoholeSort(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] count = new int[max - min + 1];
        
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        Code.printLoop(count);

        int j = 0;

        for (int i = 0; i < arr.length;) {
            while (count[j] > 0) {
                arr[i] = min + j;
                count[j]--;
                i++;
            }
            j++;
        }
        Code.printLoop(arr);
    }
}
