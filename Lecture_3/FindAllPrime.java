package Lecture_3;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllPrime {
    // Sieve algo is use to do this 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        sieveAlgo(num);
        scanner.close();
    }
    
    public static void sieveAlgo(int num) {
        boolean[] arr = new boolean[num + 1];
        Arrays.fill(arr, true); // this will the array with the true value
        
        int counter = 2;
        while (counter <= num) {
            if (arr[counter] == true) {
                for (int factor = counter + counter; factor <= num; factor = factor + counter) {
                    arr[factor] = false;
                }
            }
            counter++;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.print(i+" ");
            }
        }
    }
}

