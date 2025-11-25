package Recursion.Problems;

public class MergeSortRecursion {
    
    static void mergeSort(int[] arr, int low, int high) {

        if (low == high) {
            return;
        }

        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        return;
    }
    
    static void merge(int[] arr, int low, int mid, int high) {

        int[] newArr = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                newArr[index] = arr[left];
                index++;
                left++;
            } else {
                newArr[index] = arr[right];
                index++;
                right++;
            }
        }

        if (left <= mid) {
            while (left <= mid) {
                newArr[index++] = arr[left++];
            }
        } else {
            while (right <= high) {
                newArr[index++] = arr[right++];
            }
        }
        index = low;
        for (int i : newArr) {
            arr[index++] = i;
        }
    }
    
    public static void main(String[] args) {
        

        int[] arr = { 3, 1, 4, 5, 6, 7, 8, 9, 10, 2,1,2 };
        mergeSort(arr, 0, arr.length - 1);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
