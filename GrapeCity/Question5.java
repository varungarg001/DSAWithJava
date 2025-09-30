package GrapeCity;

public class Question5 {
    // Removing vowels from a given string. 

    public static void main(String[] args) {
        String str = "hello indians";
        String ans = removeVowels(str);
        System.out.println(ans);
    }
    
    static String removeVowels(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                ans += String.valueOf(ch);
            }
        }
        return ans;
    }

    static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
