package Searching.BinarySearch.Problems;

public class Ceil {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 5, 7, 8, 9, 10, };

        int target = 3 ;

        findCeil(arr, target);
    }
    static void findCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];
               
            }
        }
        System.out.println("The Ceil value of the given number is: "+ans);
         
    }
}
