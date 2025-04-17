public class Partition_Equal_Subset_Sum {
    class Solution {
        public boolean canPartition(int[] nums) {
            int sum = 0;
            for(int e:nums){
                sum+=e;
            }
            if(sum%2!=0) return false;
            int target = sum/2;
            Boolean dp[][] = new Boolean[nums.length+1][target+1];
            return divide(nums,nums.length-1,target,dp);
        }
        public boolean divide(int nums[],int i,int k,Boolean dp[][]){
            if(k == 0) return true;
            if(i == 0) return nums[i] == k;
            if(dp[i][k] != null) return dp[i][k];
            boolean nottake = divide(nums,i-1,k,dp);
            boolean take = false;
            if(nums[i]<=k){
                take = divide(nums,i-1,k-nums[i],dp);
            }
            return dp[i][k] = take || nottake;
        }
    }
}
