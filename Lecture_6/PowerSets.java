package Lecture_6;

import java.util.*;

public class PowerSets {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 3 ,5};
        int n = arr.length;
        int subset = 1 << n;
        powerset(arr, n, subset);
    }

    public static void powerset(int[] arr, int length, int subset) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();

        for (int i = 0; i < subset; i++) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                if (((i >> j) & 1) == 1) {
                    ans.add(arr[j]);
                }
            }
            subsets.add(ans);
        }

        for(int i=0;i<subsets.size();i++){
            for (int j : subsets.get(i)) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
