import java.util.Arrays;

public class Longest_Increasing_Path_in_a_Matrix {
    class Solution {
        public int longestIncreasingPath(int[][] matrix) {
            int dp[][] = new int[matrix.length][matrix[0].length];
            for(int e[] : dp) Arrays.fill(e,-1);
            int max = 1;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    max = Math.max(max,longPath(matrix,i,j,dp));
                }
            }
            return max;
        }
        private int dir[][] = {{1,0},{0,1},{0,-1},{-1,0}};
        private int longPath(int[][] matrix,int i,int j,int dp[][]){
            int max = 1;
            if(dp[i][j]!=-1) return dp[i][j];
            for(int e[] : dir){
                int x = e[0]+i;
                int y = e[1]+j;
                if(x>=0 && y>=0 && x<matrix.length && y<matrix[0].length && matrix[i][j]<matrix[x][y]){
                    max = Math.max(max,1+longPath(matrix,x,y,dp));
                }
            }
            return dp[i][j] = max;
        }
    }
}
