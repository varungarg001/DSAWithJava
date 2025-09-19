package Strings.Problems;

public class ReverseOfString {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse1 = reverseString1(str);
        System.out.println(reverse1);
        String reverse2 = reverseString2(str);
        System.out.println(reverse2);

    }

    public static String reverseString1(String str) {
        // 1st method
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans = str.charAt(i) + ans;
        }
        return ans;
    }

    public static String reverseString2(String str) {
        // 2nd method
        StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = sb.length() - 1;

        while (start < end) {
            char firstChar = sb.charAt(start);
            char lastChar = sb.charAt(end);
            sb.setCharAt(end, firstChar);
            sb.setCharAt(start, lastChar);
            start++;
            end--;
        }
        return String.valueOf(sb);
    }
}
