package Searching.BinarySearch.Problems.Day02;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 5, 6, 12, 13 };
        int target = 45;

        int floor = binaryFloor(arr, target);
        
        int ceil = binaryCeil(arr, target);
        

        if (floor == -1) {
            System.out.println("The minimum absolute difference will be: " + (Math.abs(ceil - target)));
            return;
        } else if (ceil == -1) {
            System.out.println("The minimum absolute difference will be: " + (Math.abs(floor - target)));
            return;
        }
        
        int ans  =(int) Math.min(Math.abs(floor - target), Math.ceil(ceil - target));
        System.out.println("The minimum absolute difference will be: "+ans);

    }
    
    static int binaryFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int binaryCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid +1;
            } else {
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}
