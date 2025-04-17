public class Spiral_Matrix_II {
    class Solution {
        public int[][] generateMatrix(int n) {
            int matrix[][] = new int[n][n];
            int count = 1;
            int rs = 0 , re = matrix.length-1 , cs = 0 , ce = matrix[0].length-1;
            while(rs<=re && cs<=ce){
                for(int i=rs;i<=ce;i++) matrix[rs][i] = count++;
                rs+=1;
                for(int i=rs;i<=re;i++) matrix[i][ce] = count++;
                ce-=1;
                if(rs<=re){
                    for(int i=ce;i>=cs;i--) matrix[re][i] = count++;
                    re-=1;
                }
                if(cs<=ce){
                    for(int i=re;i>=rs;i--) matrix[i][cs] = count++;
                    cs+=1;
                }
            }
            return matrix;
        }
    }
}
