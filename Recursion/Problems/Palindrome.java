package Recursion.Problems;

public class Palindrome {

    static boolean isPalindrome(String str, int index) {
        
        if (index >= (str.length() / 2)) {
            return true;
        }

        if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
            return false;
        }

        return isPalindrome(str, index + 1);
    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrome("hello", 0));

        // String a = "hello";
        // String b = new String("hello");

        // System.out.println(a==b);
        // System.out.println(a.equals(b));


    }
}
