package Sorting.InsertionSort;

public class Code {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1, 2, 4, 0 };
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int pos = i - 1;

            while (pos >= 0 && arr[pos] > key) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = key;

        }

        printLoop(arr);

    }

    public static void printLoop(int[] arr) {
        for (int ar : arr) {
            System.out.print(ar+" ");
        }
        System.out.println();
    }
}
