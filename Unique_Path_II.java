import java.util.Arrays;

public class Unique_Path_II {
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
            for(int e[] : dp) Arrays.fill(e,-1);
            return countPath(0,0,obstacleGrid,dp);
        }
        private int countPath(int i,int j,int matrix[][],int dp[][]){
            if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j] == 1) return 0;
            if(i == matrix.length-1 && j == matrix[0].length-1) return 1;
            if(dp[i][j] != -1) return dp[i][j];
            return dp[i][j] = countPath(i+1,j,matrix,dp) + countPath(i,j+1,matrix,dp);
        }
    }
}
