public class Remove_Duplicates_from_Sorted_Array_II {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums.length == 1) return 1;
            int p = 1;
            int i = 0;
            while(p<nums.length){
                if(nums[i] == nums[p]) p++;
                else{
                    nums[i+1] = nums[p];
                    i++;
                    p++;
                }
            }
            if(i == 0) return 1;
            return i+1;
        }
    }
}
