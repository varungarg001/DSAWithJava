package Recursion.Problems;

import java.util.*;

public class StringAllSubsequences {

    static ArrayList<String> allSequences(String str, ArrayList<Character> arr, ArrayList<String> ans, int index) {

        if (index >= str.length()) {
            String a = "";
            for (char i : arr) {
                a += String.valueOf(i);
            }
            ans.add(a);
            return ans;
        }

        arr.add(str.charAt(index));
        allSequences(str, arr, ans, index + 1);
        // Character c = str.charAt(index);
        arr.remove(arr.size()-1);
        allSequences(str, arr, ans, index + 1);
        return ans;

    }
    
    public static void main(String[] args) {
        String s = "phqghumeay";
        ArrayList<String> allSequencesans = allSequences(s, new ArrayList<Character>(), new ArrayList<String>(), 0);

        for (String i : allSequencesans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}