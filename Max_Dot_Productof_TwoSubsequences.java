import java.util.Arrays;

public class Max_Dot_Productof_TwoSubsequences {
    class Solution {
        public int maxDotProduct(int[] nums1, int[] nums2) {
            int dp[][] = new int[nums1.length][nums2.length];
            for(int i=0;i<dp.length;i++){
                Arrays.fill(dp[i],Integer.MIN_VALUE);
            }
            int ans = maxSumProduct(nums1,nums2,0,0,dp);
            return ans;
        }
        int maxSumProduct(int[] n1,int[]n2,int i,int j,int[][] dp){
            if(i==n1.length || j==n2.length) return Integer.MIN_VALUE;
            if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
            int val = n1[i] * n2[j];
            int next = maxSumProduct(n1,n2,i+1,j+1,dp);
            int takeBoth = val + Math.max(0, next);
            int takeLeft =  maxSumProduct(n1,n2,i+1,j,dp);
            int takeRight = maxSumProduct(n1,n2,i,j+1,dp);
            return dp[i][j] = Math.max(takeBoth,Math.max(takeLeft,Math.max(takeRight,val)));
        }
    }
}
