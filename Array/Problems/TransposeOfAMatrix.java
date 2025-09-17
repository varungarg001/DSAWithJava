package Array.Problems;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
        transpose(arr);
        print(arr);
    }
    
    public static void transpose(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(mat, i, j);
            }
        }
    }

    static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
