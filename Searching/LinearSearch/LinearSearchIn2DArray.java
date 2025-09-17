package Searching.LinearSearch;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 5, 6 },
                { 7, 8, 9, 45,1 },
                { 10, 11, 4, 5 }
        };

        // linearSearchIn2d(arr, 4, false);
        // linearSearchIn2d(arr, 4, true);
        // findMultipleOccurences2dArray(arr, 145);
        findMaximumSumSubArray(arr);
        // int [] [] [] arr3d = {
        //     {{1,4,5},{1,4,4},{4,7,7}},
        //     {{4,7,8},{7,8,7},{7,89,45}},
        //     {{4,7,8},{9,8,7},{1,2,3}}
        // };
    }

    static void linearSearchIn2d(int[][] arr, int target, boolean lastOccurence) {
        int row = -1;
        int column = -1;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] == target) {
                    row = i;
                    column = j;
                    if (lastOccurence == false) {
                        found = true;
                        break;
                    }
                }
            }
            if (found == true) {
                break;
            }
        }

        if (row != -1) {
            System.out.println("Elemet found at: " + row + " row and " + column + " column");
        } else {
            System.out.println("Element not found");
        }
    }

    static void findMultipleOccurences2dArray(int[][] arr, int target) {
        int size = arr.length * arr[0].length;
        int[][] ans = new int[size][2];
        int i = 0;
        // int j = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[i].length; column++) {
                if (arr[row][column] == target) {
                    ans[i][0] = row;
                    ans[i][1] = column;
                    i++;
                }
            }
        }
        if (i != 0) {
            for (int row = 0; row < i; row++) {
                System.out.print(ans[row][0] + " " + ans[row][1]);
                System.out.println();
            }
        } else {
            System.out.println("Element not found.");
        }
    }
    
    static void findMaximumSumSubArray(int[][] arr){
        int sum = 0;
        int previousSum = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > previousSum) {
                previousSum = sum;
                index = i;
                sum = 0;
            }
        }

        System.out.println("The maximum sum of the sub array are: "+previousSum+" for index "+index);
    }
}
