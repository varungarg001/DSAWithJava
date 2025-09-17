package Lecture_2.powerofnum;

public class Power {
    public static void main(String[] args) {
        // System.out.println(calcPower(10, 6));
        System.out.println(fastExponential(2, 4));
    }

    public static double calcPower(double num, int power) {
        double result = 1;

        while (power > 0) {
            result *= num;
            --power;
        }
        return result;
    }

    public static double fastExponential(double value, int power) {
        double result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= value;
            }
            power /= 2;
            value *= value;
        }
        
        return result;
        

    }
}

