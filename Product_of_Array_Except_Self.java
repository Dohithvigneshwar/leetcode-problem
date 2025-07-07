public class Product_of_Array_Except_Self {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] prefix = new int[nums.length];
            int[] sufix = new int[nums.length];
            prefix[0] = nums[0];
            for(int i=1;i<nums.length;i++){
                prefix[i] = prefix[i-1] * nums[i];
            }
            sufix[nums.length-1] = nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                sufix[i] = sufix[i+1] * nums[i];
            }

            for(int i=0;i<nums.length;i++){
                if(i == 0){
                    nums[i] = sufix[i+1];
                }
                else if(i == nums.length-1){
                    nums[i] = prefix[i-1];
                }
                else{
                    nums[i] = prefix[i-1] * sufix[i+1];
                }
            }
            return nums;
        }
    }
}
