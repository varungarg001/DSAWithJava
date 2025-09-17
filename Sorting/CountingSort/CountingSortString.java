package Sorting.CountingSort;

import Sorting.InsertionSort.Code;

public class CountingSortString {
    public static void main(String[] args) {
        String s = "edsab";
        String output = countSort(s);
        System.out.println(output);
    }
    

    public static String countSort(String s) {
        // code here

        char[] charArr = s.toCharArray();

        int[] count = new int[26];

        for (int i = 0; i < charArr.length; i++) {
            count[charArr[i] - 'a']++;
        }

        for (int i = 1; i < 26; i++) {
            count[i] += count[i - 1];
        }

        char[] output = new char[charArr.length];

        for (int i = charArr.length - 1; i >= 0; i--) {
            int val = charArr[i] - 'a';
            int index = --count[val];
            output[index] = charArr[i];
        }

        String ans = "";
        for (int i = 0; i < output.length; i++) {
            ans += String.valueOf(output[i]);
        }
        return ans;
        
    }
}
