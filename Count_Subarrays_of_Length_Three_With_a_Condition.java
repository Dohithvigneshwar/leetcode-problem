public class Count_Subarrays_of_Length_Three_With_a_Condition {
    class Solution {
        public int countSubarrays(int[] nums) {
            int count = 0;
            int l = 0, r = 2;
            while(r<nums.length){
                if(nums[l+1]%2==0 && nums[l]+nums[r] == nums[l+1]/2) count++;
                l++;
                r++;
            }
            return count;
        }
    }
}
