import java.util.LinkedList;
import java.util.Queue;

public class Max_Consecutive_Ones_III {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            Queue<Integer> index = new LinkedList<>();
            int max = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0 && index.size()<k){
                    index.add(i);
                    nums[i] = 1;
                }
                if(index.size() <= k){
                    int l = 0;
                    int r = 0;
                    for(int j=i;j>=0;j--){
                        if(nums[j]!=1){
                            break;
                        }
                        l++;
                    }
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[j]!=1){
                            break;
                        }
                        r++;
                    }
                    if(max<l+r){
                        max = l+r;
                    }
                    if(index.size()>0 && index.size()==k){
                        int it = index.remove();
                        nums[it] = 0;
                    }
                }
            }
            return max;
        }
    }
}
