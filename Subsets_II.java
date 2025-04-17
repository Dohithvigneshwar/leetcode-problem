public class Subsets_II {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> p = new ArrayList<>();
            Arrays.sort(nums);
            int n = nums.length;
            Set<List<Integer>> set = new HashSet<>();
            helper(n,nums,0,p,set);
            for(List<Integer> temp:set) ans.add(temp);
            return ans;
        }
        public void helper(int n,int nums[],int index,ArrayList<Integer> p,Set<List<Integer>> set){
            if(index>=n){
                List<Integer> a = new ArrayList<>();
                for(int e:p) a.add(e);
                set.add(a);
                return;
            }
            p.add(nums[index]);
            helper(n,nums,index+1,p,set);
            p.remove(p.size()-1);
            helper(n,nums,index+1,p,set);
        }
    }
}
