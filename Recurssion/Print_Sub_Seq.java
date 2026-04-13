package Recurssion;
public class Print_Sub_Seq {
    public static void main(String[] args) {
        String Str = "ABC";
        String ans = "";
        pss(Str,ans);
    }
    public static void pss(String ques , String ans){
        if(ques.length()== 0){
            System.out.println(ans + " ");
            return;
        }
        char ch = ques.charAt(0);
        pss(ques.substring(1), ans);
        pss(ques.substring(1), ans+ch);
    }
    
}
