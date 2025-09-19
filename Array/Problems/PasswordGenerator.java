package Array.Problems;

import java.util.Arrays;

public class PasswordGenerator {
    public static void main(String[] args) {
        int[] arr = { 12, 2, 36, 10, 217, 36, 5, 36, 15, 10,36,217 };

        int ans = passwordGenerator(arr);
        System.out.println(ans);

    }
    
    static int passwordGenerator(int[] arr) {
        Arrays.sort(arr);
        int maxSize = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > maxSize) {
                maxSize = a;
            }
        }

        int[] occurences = new int[maxSize + 1];

        for (int a : arr) {
            occurences[a]++;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int highestOccurences=Integer.MIN_VALUE;
        int secondHighesthighestOccurences=Integer.MIN_VALUE;


        for (int a : arr) {
            if (a > highest && highestOccurences <= occurences[a]) {
                secondHighest = highest;
                highest = a;
                secondHighesthighestOccurences = highestOccurences;
                highestOccurences = occurences[a];
            } else if (secondHighesthighestOccurences <= occurences[a] && a != highest) {
                    secondHighest = a;
                    secondHighesthighestOccurences = occurences[a];
                }
        }
        return (secondHighest);
    }
}
