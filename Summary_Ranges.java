import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> ans = new ArrayList<>();
            if(nums.length == 0) return ans;
            int start = nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]+1 != nums[i]){
                    if(start != nums[i-1]) {
                        ans.add((start+"->"+nums[i-1]));
                    }
                    else if(start == nums[i-1]){
                        ans.add(""+nums[i-1]);
                    }
                    start = nums[i];
                }
            }
            if(start == nums[nums.length-1]) ans.add(""+nums[nums.length-1]);
            else{
                ans.add(""+start+"->"+nums[nums.length-1]);
            }
            return ans;
        }
    }
}
