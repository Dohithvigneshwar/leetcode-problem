import java.util.ArrayList;
import java.util.List;

public class Triangle {
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            if(triangle.size() == 0) return 0;
            List<List<Integer>> dp = new ArrayList<>();
            for(int i=0;i<triangle.size();i++){
                List<Integer> temp = new ArrayList<>();
                for(int j=0;j<=i;j++) temp.add(-1);
                dp.add(temp);
            }
            return triangle.get(0).get(0) + minPath(triangle,1,0,dp);
        }
        private int minPath(List<List<Integer>> list,int i,int j,List<List<Integer>> dp){
            if(i == list.size()) return 0;
            if(dp.get(i).get(j) != -1) return dp.get(i).get(j);
            int left = list.get(i).get(j) + minPath(list,i+1,j,dp);
            int right = list.get(i).get(j+1) + minPath(list,i+1,j+1,dp);
            int val = Math.min(left, right);
            dp.get(i).set(j, val);
            return val;
        }
    }
}
