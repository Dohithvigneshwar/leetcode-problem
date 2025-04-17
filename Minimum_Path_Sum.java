public class Minimum_Path_Sum {
    class Solution {
        public int minPathSum(int[][] grid) {
            int dp[][] = new int[grid.length][grid[0].length];
            for(int i=0;i<grid[0].length;i++){
                if(i == 0){
                    dp[0][i] = grid[0][i];
                    continue;
                }
                dp[0][i] = grid[0][i]+dp[0][i-1];
            }
            for(int i=0;i<grid.length;i++){
                if(i==0){
                    dp[i][0] = grid[i][0];
                    continue;
                }
                dp[i][0] = dp[i-1][0]+grid[i][0];
            }
            for(int i=1;i<grid.length;i++){
                for(int j=1;j<grid[0].length;j++){
                    int top = dp[i-1][j]+grid[i][j];
                    int left = dp[i][j-1]+grid[i][j];
                    dp[i][j] = Math.min(top,left);
                }
            }
            return dp[grid.length-1][grid[0].length-1];
        }
    }
}
