import java.util.ArrayList;
import java.util.List;

public class Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> p = new ArrayList<>();
            int n = nums.length;
            helper(n,nums,0,p,ans);
            return ans;
        }
        public void helper(int n, int nums[], int index, ArrayList<Integer> p, List<List<Integer>> ans){
            if(index>=n){
                List<Integer> a = new ArrayList<>();
                for(int e:p) a.add(e);
                ans.add(a);
                return;
            }
            p.add(nums[index]);
            helper(n,nums,index+1,p,ans);
            p.remove(p.size()-1);
            helper(n,nums,index+1,p,ans);
        }
    }
}
