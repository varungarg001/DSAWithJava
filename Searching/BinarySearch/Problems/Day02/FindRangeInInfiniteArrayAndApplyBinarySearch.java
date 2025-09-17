package Searching.BinarySearch.Problems.Day02;

public class FindRangeInInfiniteArrayAndApplyBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 14, 19, 22, 56, 368, 999 };
        int target = 22;

        int[] range = findRange(arr, target);
        System.out.println("Start is: " + range[0] + " End at: " + range[1]);
        binarySearchInInfiniteRange(arr,range[0], range[1],target);
    }
    
    static int[] findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int[] range = new int[2];
        while (arr[end] < target) {
            start = end;
            end *= 2;
        }

        range[0] = start;
        range[1] = end;
        return range;

    }

    static void binarySearchInInfiniteRange(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at: " + mid + " postion");
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
