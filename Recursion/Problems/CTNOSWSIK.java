package Recursion.Problems;


public class CTNOSWSIK {
    
    // CTNOSWSIK - count the number of subsequences whose sum is k

    static int countSubSequences(int index, int[] arr, int sum, int k) {

        if (index == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        sum += arr[index];
        int l = countSubSequences(index + 1, arr, sum, k);

        sum -= arr[index];
        int r = countSubSequences(index + 1, arr, sum, k);

        return l + r;
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 1 };


        System.out.println(countSubSequences(0, arr, 0, 4));
    }
}
