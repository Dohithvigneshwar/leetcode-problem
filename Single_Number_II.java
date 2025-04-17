import java.util.Arrays;

public class Single_Number_II {
    class Solution {
        public int singleNumber(int[] nums) {
            if(nums.length == 0){
                return -1;
            }
            if(nums.length == 1){
                return nums[0];
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            for(int i=1;i<nums.length-1;i++){
                if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            if(nums[nums.length-1] != nums[nums.length-2]){
                return nums[nums.length-1];
            }
            if(nums[0] != nums[1]){
                return nums[0];
            }
            return -1;
        }
    }
}
