public class Count_Subarrays_With_Score_Less_Than_K {
    class Solution {
        public long countSubarrays(int[] nums, long k) {
            long count = 0;
            int r=0;
            long sum = 0;
            for(int i=0;i<nums.length;i++){
                sum += nums[i];
                while(sum * (i-r+1)>=k){
                    sum-=nums[r];
                    r++;
                }
                count+=(i-r+1);
            }
            return count;
        }
    }
}
