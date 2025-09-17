package Searching.BinarySearch.Problems;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 4, 4, 5, 6, 7, 8, 9 };
        int target = 4;

        firstOccurence(arr, target);

    }
    
    static void firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start) + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (ans != -1) {
            System.out.println("The first occurence if the given target is: "+ans);
        } else {
            System.out.println("Element not found");
        }
    }
}
