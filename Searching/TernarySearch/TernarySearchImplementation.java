package Searching.TernarySearch;

public class TernarySearchImplementation {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 8, 9, 10, 14, 54, 154, 478 };
        int target = 0;

        ternarySearch(arr, target);
    }

    static void ternarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if (arr[mid1] >= target) {
                if (arr[mid1] == target) {
                    System.out.println("Element found ");
                    return;
                }
                end = mid1 - 1;
            } else if (arr[mid2] <= target) {
                if (arr[mid2] == target) {
                    System.out.println("Element found ");
                    return;
                }
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        System.out.println("Element not found ");
        return;
    }
}
