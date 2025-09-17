public class DecimaltoBinary {

    public static void main(String[] args) {
        DecimaltoBinary obj = new DecimaltoBinary();

        obj.decimaltobinary(71);
    }
    
    void decimaltobinary(int num) {
        int resNum = 0;
        int i = 0;
        while (num > 0) {
            int remainder = num % 2;
            num /= 2;
            resNum = resNum + remainder*(int)Math.pow(10,i++);
        }
        
        System.out.println(resNum);
    }
}