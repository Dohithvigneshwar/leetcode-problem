import java.util.LinkedList;
import java.util.Queue;

public class _01_Matrix {
    class Solution {
        class Pairs{
            int i,j,d;
            public Pairs(int i,int j,int d){
                this.i = i;
                this.j = j;
                this.d = d;
            }
        }
        public int[][] updateMatrix(int[][] mat) {
            boolean visited[][] = new boolean[mat.length][mat[0].length];
            int res[][] = new int[mat.length][mat[0].length];
            Queue<Pairs> queue = new LinkedList<>();
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j] == 0){
                        queue.add(new Pairs(i,j,0));
                        visited[i][j] = true;
                    }
                }
            }
            int dir[][] = {{-1,0},{0,-1},{1,0},{0,1}};
            while(queue.isEmpty() == false){
                Pairs rem = queue.remove();
                for(int e[] : dir){
                    int x = e[0]+rem.i;
                    int y = e[1]+rem.j;
                    if(x>=0 && x<mat.length && y>=0 && y<mat[0].length && !visited[x][y]){
                        queue.add(new Pairs(x,y,rem.d+1));
                        visited[x][y] = true;
                    }
                }
                res[rem.i][rem.j] = rem.d;
            }
            return res;
        }
    }
}
