package Searching.BinarySearch.Problems;

public class MedianofRowSortedArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5 }};
        median(arr);
    }

    public static void median(int[][] arr) {
        int start = 1;
        int end = 2000;
        int n = arr.length * (arr[0].length);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int k = noOfLesserElement(arr, mid);
            if (k <= (n / 2)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
    }

    public static int noOfLesserElement(int[][] arr, int assumedMean) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[0].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[i][mid] <= assumedMean) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            k += start;
        }
        return k;
        
    }
}
