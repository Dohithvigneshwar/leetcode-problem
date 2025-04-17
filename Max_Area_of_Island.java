public class Max_Area_of_Island {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int max = 0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j] == 1){
                        max = Math.max(max,dfs(grid,i,j));
                    }
                }
            }
            return max;
        }
        public int dfs(int[][] grid,int i,int j){
            if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j] != 1){
                return 0;
            }
            grid[i][j] = 0;
            int size = 1;
            size += dfs(grid,i,j+1);
            size += dfs(grid,i,j-1);
            size += dfs(grid,i-1,j);
            size += dfs(grid,i+1,j);
            return size;

        }
    }
}
