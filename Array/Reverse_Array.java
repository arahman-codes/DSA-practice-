public class Reverse_Array {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90,100 };
        int n = nums.length;
        int j = n-1;
        for(int i = 0 ; i < n/2 ; i++ ){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            j--;
        }
        for(int element:nums){
            System.out.print(element + " ");
        }
    }
}
