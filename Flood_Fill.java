public class Flood_Fill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            dfs(image,sr,sc,color,image[sr][sc]);
            return image;
        }
        public void dfs(int image[][],int i,int j,int color,int pre){
            if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]==color || image[i][j] != pre){
                return;
            }
            image[i][j] = color;
            dfs(image,i,j+1,color,pre);
            dfs(image,i,j-1,color,pre);
            dfs(image,i-1,j,color,pre);
            dfs(image,i+1,j,color,pre);
        }
    }
}
