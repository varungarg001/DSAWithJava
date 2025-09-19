package Strings.Problems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "naman";
        boolean ans1 = isPalindrome1(str);
        System.out.println(ans1);
        boolean ans2 = isPalindrome2(str);
        System.out.println(ans2);
    }

    static boolean isPalindrome1(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        if (reverse.equals(str)) {
            return true;
        }
        return false;
    }

    static boolean isPalindrome2(String str) {
        String input = str.toLowerCase();  // to validate for all lower and upper case
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
