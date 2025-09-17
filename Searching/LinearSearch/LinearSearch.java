package Searching.LinearSearch;
// linear search is a searching algorithm which is use to an search element from the array of the element.

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 9, 7, 10, 1,10 };

        // linearSearch(arr, 1, false); // in this false represent -> the function will return or print the first occurence of the target.
        // linearSearch(arr, 1, true); // in this true represent -> the function will return or print the last occurence of the target.
        // linearSearch(arr, 0, false);

        linearSearchMultipleOccurence(arr, 1);
    }
    
    public static void linearSearch(int[] arr, int target, boolean lastOcuurence) {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                pos = i;
                if (lastOcuurence == false) {
                    break;
                }
            }
        }

        if (pos == -1) {
            System.out.println("Element is not found.");
            return;
        }

        System.out.println("Element is found at: " + pos + " postion.");
    }

    static void linearSearchMultipleOccurence(int[] arr, int target) {
        int[] occurence = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                occurence[count++] = i;
            }
        }
        if (count == 0) {
            System.out.println("Element is not found.");
            return;
        }
        System.out.print("The occurences of "+target+" are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(occurence[i] + " ");
        }
        System.out.println();
    }
    

}
