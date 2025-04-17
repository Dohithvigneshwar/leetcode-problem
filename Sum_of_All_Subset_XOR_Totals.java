public class Sum_of_All_Subset_XOR_Totals {
    class Solution {
        public int subsetXORSum(int[] nums) {
            return helper(0,nums,0);
        }
        public int helper(int index,int nums[],int res){
            if(index == nums.length){
                return res;
            }
            int l = helper(index+1,nums,res ^ nums[index]);
            int r = helper(index+1,nums,res);
            return l+r;
        }
    }
}
