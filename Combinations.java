import java.util.ArrayList;
import java.util.List;

public class Combinations {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            limit = k;
            end = n;
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            combination(1,ans,temp);
            return ans;
        }
        private int limit = 0;
        private int end = 0;
        private void combination(int index,List<List<Integer>> ans,List<Integer> temp){
            if(temp.size() == limit){
                ans.add(new ArrayList<>(temp));
                return;
            }
            for(int i=index;i<=end;i++){
                temp.add(i);
                combination(i+1,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
