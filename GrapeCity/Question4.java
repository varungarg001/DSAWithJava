package GrapeCity;

import java.util.Arrays;

import Sorting.InsertionSort.Code;

public class Question4 {

    //  Given an array of integers, print the array in such a way that the 
   //     first element is first maximum and second element is first minimum and so 
  // on. 
  public static void main(String[] args) {
      int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
      int[] ans = printMaxAndThenMin(arr);
      Code.printLoop(ans);
    }

    static int[] printMaxAndThenMin(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        int element=0;
        while (start <= end) {
            ans[element++] = arr[end];
            if (element >= arr.length) {
                break;
            }
            ans[element++] = arr[start];
            start++;
            end--;
        }
        return ans;
    }
}
