package Array.Lecture_1;

import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];

        for(int i=0;i<3;i++){
            System.out.println("Enter the "+i+" element");
            arr[i] = scanner.nextInt();
        }
       
        printArray(arr);

        insert(arr, 2,10);
        printArray(arr);
        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void insert(int[] arr, int pos,int value) {
        for (int i = (arr.length - 2); i >=(pos-1); i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos-1] = value;
    }
}
