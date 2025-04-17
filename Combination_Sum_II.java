import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<Integer> list = new ArrayList<>();
            helper(candidates,0,target,0,list);
            return res;
        }
        public void helper(int a[], int index, int target, int sum, List<Integer> list){
            if(sum == target){
                List<Integer> temp = new ArrayList<>(list);
                res.add(temp);
                return;
            }
            if(sum>target) return;
            if(index == a.length) return;
            for(int i=index;i<a.length;i++){
                if(i>index && a[i] == a[i-1]) continue;
                list.add(a[i]);
                helper(a,i+1,target,sum+a[i],list);
                list.remove(list.size()-1);
            }
        }
    }
}
