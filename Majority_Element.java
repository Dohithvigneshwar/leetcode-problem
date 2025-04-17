public class Majority_Element {
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 1;
            int current = nums[0];
            for(int i=1;i<nums.length;i++) {
                if(count == 0) {
                    current = nums[i];
                }
                if(current == nums[i]) {
                    count++;
                }
                else {
                    count --;
                }

            }
            return current;
            // Arrays.sort(nums);
            // current = nums.length/2;
            //  return nums[current];
        }
    }
}
