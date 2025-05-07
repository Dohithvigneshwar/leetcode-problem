public class House_Robber_II {
    class Solution {
        public int rob(int[] nums) {
            int a[] = new int[nums.length];
            int b[] = new int[nums.length];
            int p1 = 0, p2 = 0;
            for(int i=0;i<nums.length;i++){
                if(i == 0){
                    a[p1++] = nums[i];
                    continue;
                }
                if(i == nums.length-1){
                    b[p2++] = nums[i];
                    continue;
                }
                a[p1++] = nums[i];
                b[p2++] = nums[i];
            }
            return Math.max(maxRob(a),maxRob(b));
        }
        public int maxRob(int nums[]){
            int pre1 = nums[0];
            int pre2 = 0;
            int cur = 0;
            for(int i=1;i<nums.length;i++){
                int take = nums[i] + ((i > 1) ? pre2 : 0);
                int nottake = pre1;
                cur = Math.max(take,nottake);
                pre2 = pre1;
                pre1 = cur;
            }
            return pre1;
        }
    }
}
