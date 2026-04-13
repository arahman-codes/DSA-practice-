package Recurssion;

public class Finonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
    public static int fibo(int n ){
        if(n == 2 || n == 1){
            return 1;
        }
        int f_one = fibo(n-1);
        int f_two = fibo(n-2);
        return (f_one+f_two);
    }
}
