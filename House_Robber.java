import java.util.Arrays;

public class House_Robber {
    class Solution {
        public int rob(int[] nums) {
            int dp[] = new int[nums.length];
            Arrays.fill(dp,-1);
            return maxRob(nums.length-1,nums,dp);
        }
        public int maxRob(int i, int nums[],int dp[]){
            if(i< 0) return 0;
            if(dp[i] != -1) return dp[i];
            int take = nums[i] + maxRob(i-2,nums,dp);
            int nottake = maxRob(i-1,nums,dp);
            return dp[i] = Math.max(take,nottake);
        }
    }
}
