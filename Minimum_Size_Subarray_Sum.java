public class Minimum_Size_Subarray_Sum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int l = 0;
            int sum = 0;
            int len = Integer.MAX_VALUE;
            for(int r=0;r<nums.length;r++){
                sum+=nums[r];
                while(sum>=target){
                    len = Math.min(r-l+1,len);
                    sum-=nums[l];
                    l++;
                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;
        }
    }
}
