package Sorting.CyclicSort.Problems;

import Sorting.SelectionSort.code;

// you are given a number n and a array from [0,N] so have to find out which number is missing in that array.

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 }; // actual contains:{0,1,2,3}
        int usingMathFormula = usingMathFormula(arr);
        System.out.println(usingMathFormula);

        int usingCyclicSort = usingCyclicSort(arr);
        System.out.println(usingCyclicSort);

    }
    
    static int usingMathFormula(int[] arr) {
        int n = arr.length;

        int sum = 0;
        int sumOfNNaturalNumber = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (sumOfNNaturalNumber - sum);

    }
    
    static int usingCyclicSort(int[] arr) {
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    static void cyclicSort(int[]arr){
        int index = 0;
        while (index < arr.length) {
            int actualPos = arr[index];
            if (arr[index]<arr.length && arr[actualPos] != arr[index]) {
                code.swap(arr, index, actualPos);
            } else {
                index++;
            }
        }
    }
}
