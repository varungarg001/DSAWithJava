package Array.Lecture_1;

public class _2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }

        print2DArray(arr);

        insertIn2DArray(arr, 0, 2, 10);
        print2DArray(arr);

        deletionIn2DArray(arr, 0, 1);
        print2DArray(arr);
    }

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void insertIn2DArray(int[][] arr, int i, int j, int value) {

        for (int column = arr[0].length - 2; column >= j; column--) {
            arr[i][column + 1] = arr[i][column];
        }
        arr[i][j] = value;
    }

    public static void deletionIn2DArray(int[][] arr, int i, int j) {
        for (int column = j; column < (arr[0].length - 1); column++) {
            arr[i][column] = arr[i][column + 1];
        }
        arr[i][arr[0].length - 1] = 0;
    }
}


