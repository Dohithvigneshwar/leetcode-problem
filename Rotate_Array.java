public class Rotate_Array {
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k%nums.length;
            if(k == 0) return;
            reverse(0,nums.length-1,nums);
            reverse(0,k-1,nums);
            reverse(k,nums.length-1,nums);
        }
        private void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        private void reverse(int s,int e,int[] nums){
            while(s<=e){
                swap(nums,s,e);
                s++;
                e--;
            }
        }
    }   
}
