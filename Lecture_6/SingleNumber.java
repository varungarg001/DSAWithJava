package Lecture_6;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2,3,6,3 };
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                ans = ans | (1 << i);
            }
        }
        System.out.println(ans);
        
        
    }
}
