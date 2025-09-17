public class temp {
    public static void main(String[] args) {
        String a = "kumud";
        String b = "kumar";

        String longer="";
        String shorter="";

        if (a.length() > b.length()) {
            longer = a;
            shorter = b;
        } else if (a.length() < b.length()) {
            longer = b;
            shorter = a;
        } else {
            for (int i = 0; i < a.length(); i++) {
                int char1 = a.charAt(i);
                int char2 = b.charAt(i);

                if (char1 > char2) {
                    shorter = b;
                    longer = a;
                    break;
                } else if (char1 < char2) {
                    shorter = a;
                    longer = b;
                    break;
                }
            }
        }
        
        System.out.println(longer+" "+shorter);

     

        
    }
}