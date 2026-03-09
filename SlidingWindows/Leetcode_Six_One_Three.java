package SlidingWindows;
public class Leetcode_Six_One_Three {
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        int sum = 0;
        int[] ans = new int[nums.length-k+1];
        for(int i = 0 ; i < nums.length;i++){
            sum += nums[i];
            if(i >= k-1){
                ans[i-k+1] = sum;
                sum -= nums[i-k+1];
            }
        }
        Double max = Double.MIN_VALUE;
        for(int i = 0 ; i < ans.length;i++){
            max = Math.max(max,ans[i]);
        }
        System.out.println(max/k);
    }
}