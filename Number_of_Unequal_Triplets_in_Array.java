public class Number_of_Unequal_Triplets_in_Array {
    class Solution {
        public int unequalTriplets(int[] nums) {
            int count = 0;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    for(int k=j+1;k<nums.length;k++){
                        if((nums[j] != nums[i]) && (nums[k] != nums[j]) && (nums[i] != nums[k])) count++;
                    }
                }
            }
            return count;
        }
    }
}
