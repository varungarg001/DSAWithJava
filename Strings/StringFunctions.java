package Strings;

public class StringFunctions {
    public static void main(String[] args) {
        String name = "Varun Kumar";
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.charAt(10));

        // System.out.println(name.indexOf("r"));

        // System.out.println(name.compareTo("Varun Kumar"));

        String str = "        champion        ";
        System.out.println(str);
        System.out.println(str.trim());

        System.out.println(name.subSequence(1, 11));

        String email1 = "varun124@gmail.com";
        String email2 = "avemger@miet.com";

        String[] email = email2.split("@");
        String lastPart = email[email.length - 1];

        int dotIndex = lastPart.lastIndexOf(".");
        System.out.println(lastPart.substring(0, dotIndex));


    }
}
