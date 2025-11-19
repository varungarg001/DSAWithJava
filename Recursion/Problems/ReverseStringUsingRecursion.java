package Recursion.Problems;

public class ReverseStringUsingRecursion {
    
    static String reverseString(String b, int index) {

        if (index >= b.length()-1) {
            // System.out.println(res);
            return "";
        }
        
        return reverseString(b, ++index)+String.valueOf(b.charAt(index));
    
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("hello", 0));
    }
}
