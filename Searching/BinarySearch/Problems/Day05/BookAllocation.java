package Searching.BinarySearch.Problems.Day05;

public class BookAllocation {
    public static void main(String[] args) {
        int[] books = { 12, 34, 67, 90 };
        int students = 2;

        System.out.println(bookAllocation(books, students));
    }
    
    public static int bookAllocation(int[] books, int students) {

        if (books.length < students) {
            return -1;
        }
        int res = -1;
        int start = Integer.MIN_VALUE; // max element of an array.
        int end = 0; // sum of array.

        for (int i = 0; i < books.length; i++) {
            if (books[i] > start) {
                start = books[i];
            }
            end += books[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAllocationPossible(books, mid, students)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
    
    public static boolean isAllocationPossible(int[] books, int maxPages, int students) {
        int totalStudents = 1;
        int pages = 0;

        for (int i = 0; i < books.length; i++) {
            pages += books[i];
            if (pages > maxPages) {
                totalStudents++;
                pages = books[i];
            }

            if (totalStudents > students) {
                return false;
            }
        }
        return true;

    }
}
