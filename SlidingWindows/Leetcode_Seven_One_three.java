package SlidingWindows;
public class Leetcode_Seven_One_three {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1,4,2,3,7,2,1,5,6,2,3,1,4,2,6,3,5,2,1,4,3,2,6,1,5,3};
        int k = 50;
        int si = 0;
        int ei = 0;
        int ans = 0;
        int p = 1;
        while(ei<nums.length){
            p *= nums[ei];
            while(p >= k && si <= ei){
                p /= nums[si];
                si++;
            }
            ans += (ei-si+1);
            ei++;
        }
        System.out.println(ans);
    }
}
