import java.util.LinkedList;
import java.util.Queue;

public class Rotting_Oranges {
    // class Solution {
//     public int orangesRotting(int[][] grid) {
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==2){
//                     dfs(grid,i,j,2);
//                 }
//             }
//         }
//         int max = 0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j] == 1) return -1;
//                 max = Math.max(max,grid[i][j]);
//             }
//         }
//         return max == 0 ? 0 : max-2;
//     }
//     public void dfs(int grid[][],int i,int j,int count){
//         if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0 || grid[i][j] > 1 & grid[i][j]<count){
//             return;
//         }
//         grid[i][j] = count;
//         dfs(grid,i,j+1,count+1);
//         dfs(grid,i,j-1,count+1);
//         dfs(grid,i+1,j,count+1);
//         dfs(grid,i-1,j,count+1);
//     }
// }

    class Solution{
        public int orangesRotting(int[][] grid) {
            Queue<Pair> queue = new LinkedList<>();
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j] == 2){
                        queue.add(new Pair(i,j));
                    }
                }
            }
            int time = 0;
            while(!queue.isEmpty()){
                int n = queue.size();
                boolean flag = false;
                for(int i=0;i<n;i++){
                    Pair rem = queue.remove();
                    int dir[][] = {{1,0},{0,1},{0,-1},{-1,0}};
                    for(int d[] : dir){
                        int x = d[0]+rem.i;
                        int y = d[1]+rem.j;
                        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y] == 1){
                            grid[x][y] = 2;
                            queue.add(new Pair(x,y));
                            flag = true;
                        }
                    }
                }
                if(flag) time++;
            }
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++) if(grid[i][j] == 1) return -1;
            }
            return time;
        }
        class Pair{
            int i,j;
            public Pair(int i,int j){
                this.i = i;
                this.j = j;
            }
        }
    }
}
