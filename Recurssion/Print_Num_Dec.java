package Recurssion;

public class Print_Num_Dec {
    public static void main(String[] args) {
        int num = 10;
        print_Num(num);
    }

    public static void print_Num(int num) {
        if(num == 0){
            return;
        }
        System.out.println(num);
        print_Num(num-1);
    }
}
