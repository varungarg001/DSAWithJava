package Recursion.Problems;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pos = partion(arr, low, high);
        quickSort(arr, low, pos - 1);
        quickSort(arr, pos + 1, high);
    }

    static int partion(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while(arr[i]<=pivot && i <= high-1){
                i++;
            }
            while(arr[j]>pivot && j >= low+1){
                j--;
            }

            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr, j, low);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4,6, 3, 2, 1,10 };
        quickSort(arr, 0, (arr.length - 1));

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

