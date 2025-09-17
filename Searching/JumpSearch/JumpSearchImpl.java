package Searching.JumpSearch;

public class JumpSearchImpl {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 8, 9, 10, 14, 54, 154, 478 };
        int target = 478;

        jumpSearch(arr, target);
    }

    static void jumpSearch(int[] arr, int target) {
        int blockSize =(int) Math.sqrt(arr.length);
        int start = 0;
        int end = blockSize ;

        while (end < arr.length && arr[end]<=target) {
            start = end;
            end += blockSize;
            if (end > arr.length) {
                end = arr.length;
            }
        }
        for (int i = start; i <  end; i++) {
            if (arr[i] == target) {
                System.out.println("Element found ");
                return;
            }
        }
        System.out.println("Element not found");
        return;
        
    }
}
