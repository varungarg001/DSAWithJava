package Recursion.Problems;

import java.util.ArrayList;

public class PrintAllSubSequences {
    
    static void f(int[] arr, int index, ArrayList<Integer> arr1) {

        if (index >= arr.length) {
            for (int i : arr1) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        arr1.add(arr[index]);
        f(arr, index + 1, arr1);
        Integer value=arr[index];
        arr1.remove(value);
        f(arr, index + 1, arr1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer>arr1=new ArrayList<>();

        int[]arr={1,2,3};

        f(arr,0,arr1);
    }
}
