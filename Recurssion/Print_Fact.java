package Recurssion;

public class Print_Fact {
    public static void main(String[] args) {
        int num = 10 ;
        System.out.println(Print_Fact(num));
    }
    public static int Print_Fact(int num){
        if(num == 0){
            return 1;
        }
        int fn = Print_Fact(num-1);
        return num * fn;
    }
    
}
