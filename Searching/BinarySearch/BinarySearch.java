package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr1 = { 1, 4, 5, 6, 8, 9 };

        int[] arr1 = { 9, 8, 7, 2, 1, 1, 0 };

        int target = 0;

        if (arr1[0] < arr1[arr1.length - 1]) {
            binarySearchAsc(arr1, target);
        } else {
            binarySearchDesc(arr1, target);
        }


    }
    
    static void binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at: " + mid);
                return;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element not found ");
    }
    
    static void binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at: " + mid);
                return;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println("Element not found ");
    }
}
