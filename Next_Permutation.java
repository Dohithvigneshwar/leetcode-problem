public class Next_Permutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            int min = -1;
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    min = i;
                    break;
                }
            }
            if(min == -1){
                reverse(nums,0,nums.length-1);
                return;
            }
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[min]){
                    int temp = nums[i];
                    nums[i] = nums[min];
                    nums[min] = temp;
                    break;
                }
            }
            reverse(nums,min+1,nums.length-1);
        }
        private void reverse(int nums[],int i,int j){
            while(i<=j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
    }
}
