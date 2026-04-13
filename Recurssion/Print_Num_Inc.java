package Recurssion;

public class Print_Num_Inc {
    public static void main(String[] args) {
        int num = 10;
        print(num,1);
    }
    public static void print(int num , int ans ){
        if(ans<=num){
            System.out.println(ans);
            return;
        }
        
        print(num,ans+1);
    }
}
