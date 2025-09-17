package Sorting.CyclicSort.Problems;

import java.util.ArrayList;
import java.util.List;

import Sorting.CyclicSort.CyclicSort;

// you are given a array [1,N] and it contains some duplicate elements so have to find out which elements are missing
public class NumberDisappeared {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 3, 3 };

        List<Integer> ans = numberDisappeared(arr);
        System.out.println(ans);
    }

    static List<Integer> numberDisappeared(int[] arr) {
        CyclicSort.cyclicSort(arr);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
