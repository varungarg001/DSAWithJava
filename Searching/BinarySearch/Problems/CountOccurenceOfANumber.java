package Searching.BinarySearch.Problems;

public class CountOccurenceOfANumber {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 7, 7, 7, 7, 8, 9 };
        int target = 7;

        int first = countOccurences(arr, target, true);
        int last = countOccurences(arr, target, false);

        if (first == -1) {
            System.out.println("Number of occurences of the target is: " +0);
            return;

        }

        System.out.println("Number of occurences of the target is: " + (last - first + 1));
    }
    
    static int countOccurences(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
