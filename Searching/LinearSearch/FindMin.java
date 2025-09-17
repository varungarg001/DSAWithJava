package Searching.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 7, 8, 10, 4, 5, 6, -1 };

        findMin(arr);
    }

    static void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        
        System.out.println("The minimum value in the array is: "+min);
    }
}
