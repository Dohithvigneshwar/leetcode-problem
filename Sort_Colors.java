public class Sort_Colors {
    class Solution {
        public void sortColors(int[] nums) {
            int c1 = 0, c2 = 0, c3 = 0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i] == 0) {
                    c1++;
                }
                else if(nums[i] == 1) {
                    c2++;
                }
                else {
                    c3++;
                }
            }
            int index = 0;
            while(c1!=0 || c2!=0 || c3!=0) {
                if(c1!=0) {
                    nums[index] = 0;
                    c1-=1;
                }
                else if(c2!=0) {
                    nums[index] = 1;
                    c2-=1;
                }
                else {
                    nums[index] = 2;
                    c3-=1;
                }
                index++;
            }
        }
    }
}
