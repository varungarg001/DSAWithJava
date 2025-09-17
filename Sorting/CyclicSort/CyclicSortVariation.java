package Sorting.CyclicSort;

import Sorting.InsertionSort.Code;

public class CyclicSortVariation {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 9, 10,10,4, 2 };
        cyclicSortVariation(arr);
    }

    static void cyclicSortVariation(int[] arr) {
        for (int cycle = 0; cycle < arr.length - 1; cycle++) {
            int pos = cycle;
            int item = arr[pos];
            // searching for smaller element
            for (int i = cycle + 1; i < arr.length; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            // if there is no smaller element
            if (cycle == pos) {
                continue;
            }

            // for duplicate
            while (item == arr[pos]) {
                pos++;
            }

            // swapping 
            if (pos != cycle) {
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }

            // if more swaps are required

            while (pos != cycle) {
                pos = cycle;
                // searching for smaller element
                for (int i = cycle + 1; i < arr.length; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                // for ignore duplicates
                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;

                }

            }
        }
        Code.printLoop(arr);
    }
        
}
