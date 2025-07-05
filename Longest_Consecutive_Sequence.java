import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int e : nums) set.add(e);
            int max = 0;
            for(int e:set){
                if(!set.contains(e-1)){
                    int count = 1;
                    int temp = e+1;
                    while(set.contains(temp)){
                        temp = temp+1;
                        count = count+1;
                    }
                    max = Math.max(max,count);
                }
            }
            return max;
        }
    }
}
