import java.util.ArrayList;
import java.util.List;

public class Pacific_Atlantic_Water_Flow {
    class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] heights) {
            List<List<Integer>> ans = new ArrayList<>();
            int r = heights.length;
            int c = heights[0].length;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    int dp[][] = new int[r][c];
                    if(validPacific(heights,i,j,r,c,dp,heights[i][j])){
                        dp = new int[r][c];
                        if(validAtlantic(heights,i,j,r,c,dp,heights[i][j])){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(i);
                            temp.add(j);
                            ans.add(temp);
                        }
                    }
                }
            }
            return ans;
        }
        public boolean validPacific(int heights[][],int i,int j,int r,int c,int dp[][],int pre){
            if((i==0 && heights[i][j]<=pre) ||(j==0 && heights[i][j]<=pre)){
                return true;
            }
            if(i>=0 && j>=0 && i<r && j<c && dp[i][j]==0 && heights[i][j]<=pre){
                dp[i][j] = 1;
                if(validPacific(heights,i+1,j,r,c,dp,heights[i][j])){
                    return true;
                }
                if(validPacific(heights,i-1,j,r,c,dp,heights[i][j])){
                    return true;
                }
                if(validPacific(heights,i,j+1,r,c,dp,heights[i][j])){
                    return true;
                }
                if(validPacific(heights,i,j-1,r,c,dp,heights[i][j])){
                    return true;
                }
                dp[i][j] = 0;
            }
            return false;
        }
        public boolean validAtlantic(int heights[][],int i,int j,int r,int c,int dp[][],int pre){
            if((i==r-1  && heights[i][j]<=pre) ||(j==c-1 && heights[i][j]<=pre)){
                return true;
            }

            if(i>=0 && j>=0 && i<r && j<c && dp[i][j]==0 && heights[i][j]<=pre){
                dp[i][j] = 1;
                if(validAtlantic(heights,i+1,j,r,c,dp,heights[i][j])){
                    return true;
                }
                if(validAtlantic(heights,i-1,j,r,c,dp,heights[i][j])){
                    return true;
                }
                if(validAtlantic(heights,i,j+1,r,c,dp,heights[i][j])){
                    return true;
                }
                if(validAtlantic(heights,i,j-1,r,c,dp,heights[i][j])){
                    return true;
                }
                dp[i][j] = 0;
            }
            return false;
        }
    }
}
