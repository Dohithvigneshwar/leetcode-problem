import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int rs = 0 , re = matrix.length-1 , cs = 0 , ce = matrix[0].length-1;
            while(rs<=re && cs<=ce){
                for(int i=rs;i<=ce;i++) list.add(matrix[rs][i]);
                rs+=1;
                for(int i=rs;i<=re;i++) list.add(matrix[i][ce]);
                ce-=1;
                if(rs<=re){
                    for(int i=ce;i>=cs;i--) list.add(matrix[re][i]);
                    re-=1;
                }
                if(cs<=ce){
                    for(int i=re;i>=rs;i--) list.add(matrix[i][cs]);
                    cs+=1;
                }
            }
            return list;
        }
    }
}
