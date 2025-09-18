package Strings.Problems;

public class AllSubstring {
    public static void main(String[] args) {
        String str = "varun";

        String[] arr = allSubString(str);
        
        for (String a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();


    }

    public static String[] allSubString(String str) {
        int n = str.length();
        int totalElement = n * (n + 1) / 2;
        String[] ans = new String[totalElement];
        int element=0;

        for (int start = 0; start < str.length(); start++) {
            for (int end = start+1; end <= str.length(); end++) {
                ans[element] = str.substring(start, end);
                element++;
            }
        }
        return ans;
    }
}
