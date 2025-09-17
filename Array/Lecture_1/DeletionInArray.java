package Array.Lecture_1;

import java.util.Scanner;

public class DeletionInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i+1) + " element");
            arr[i] = scanner.nextInt();
        }

        InsertInArray.printArray(arr);
        delete(arr, 3);
        InsertInArray.printArray(arr);
        scanner.close();
    }
    
    public static void delete(int[] arr, int pos) {
        for (int i = pos - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
