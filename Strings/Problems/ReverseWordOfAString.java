package Strings.Problems;

public class ReverseWordOfAString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String ans = reverseWords(str);
        System.out.println(ans);
    }
    static String reverseWords(String s) {
        String[]arr=s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=""){
                if(ans.length()==0){
                    ans+=arr[i];
                }else{
                    ans=ans+" "+arr[i];
                }
            }
        }
        return ans;
    }
}
