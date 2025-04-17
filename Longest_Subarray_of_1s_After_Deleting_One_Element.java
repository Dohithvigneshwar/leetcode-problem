public class Longest_Subarray_of_1s_After_Deleting_One_Element {
    class Solution {
        public int longestSubarray(int[] nums) {
            int start = 0;
            int max = 0;
            boolean flag = true;
            while(start<nums.length){
                if(nums[start] == 0){
                    flag = false;
                    int left = 0;
                    int right = 0;
                    for(int i=start-1;i>=0;i--){
                        if(nums[i]==0){
                            break;
                        }
                        left++;
                    }
                    for(int i=start+1;i<nums.length;i++){
                        if(nums[i]==0){
                            break;
                        }
                        right++;
                    }
                    max = Math.max(max,left+right);
                    start++;
                }
                else{
                    start++;
                }
            }
            if(flag) return nums.length-1;
            return max;
        }
    }
}
