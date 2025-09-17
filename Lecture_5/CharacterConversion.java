package Lecture_5;


public class CharacterConversion {
    public static void main(String[] args) {
        char lowerCase = 'b';
    //    System.out.println(lowerCase);

        char upperCase = convertFromLowerToUpper(lowerCase);
        System.out.println(upperCase + " using function ");
        System.out.println(convertFromUpperToLower(upperCase)+" using function");


    }

    public static char convertFromLowerToUpper(int num) {
        return (char) (num & ~(1 << 5));
    }

    public static char convertFromUpperToLower(int num) {
        return (char) (num | (1 << 5));
    }
}
