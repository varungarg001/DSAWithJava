package Lecture_3;

public class SqrtNewAlgo {
    public static void main(String[] args) {
        int result=(int)newtonRapshonAlgoSqrt(4);
        System.out.println(result);
    }
    
    public static double newtonRapshonAlgoSqrt(int num) {
        double assumeRoot = num;
        double toleranceLevel = 0.001;
        double root;
        while (true) {
            root = 0.5 * (assumeRoot + (num / assumeRoot));
            double ans = assumeRoot - root;
            if (ans < toleranceLevel) {
                break;
            }
            assumeRoot = root;
        }

        return root;


    }
}
