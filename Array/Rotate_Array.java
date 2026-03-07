public class Rotate_Array {
    public static void  print(int[] arr){
        for(int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90,100 };
        int k = 3;
        int n = nums.length;
        k = k%n;
        int[] K_arr= new int[k];

        print(nums);
        System.out.println();
        int x = n-k;
        for(int i = 0 ; i < k ; i++){
            K_arr[i] = nums[x];
            x++;
        }
        print(K_arr);
        System.out.println();
        int[] clone = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            clone[i]=nums[i];
        }
        print(clone);
        System.out.println();
        for(int i = 0 ; i < k ; i++ ){
            nums[i] = K_arr[i];
        }
        print(nums);
        System.out.println();
        int y = 0 ;
        for(int i = k ; i < n ; i++ ){
            nums[i]= clone[y];
            y++;
        }
        print(nums);
    }
}
