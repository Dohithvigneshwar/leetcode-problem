public class Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    class Solution {
        public int maximumCount(int[] nums) {
            int neg = 0;
            int pos = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == 0){
                    continue;
                }
                else if(nums[i]>0){
                    pos++;
                }
                else{
                    neg++;
                }
            }
            return Math.max(neg,pos);
        }
    }
}
