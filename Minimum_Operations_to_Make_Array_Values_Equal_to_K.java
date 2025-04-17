import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class Minimum_Operations_to_Make_Array_Values_Equal_to_K {
    class Solution {
        public int minOperations(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            for(int i:nums) set.add(i);
            int count = 0;
            System.out.println(set);
            while(set.size()!=1){
                int max = Collections.max(set);
                Set<Integer> newset = new HashSet<>();
                for(int e:set){
                    if(e == max) continue;
                    newset.add(e);
                }
                set = newset;
                count++;
            }
            int element = 0;
            for(int e : set) element = e;
            if(element > k) return count+1;
            if(k == element) return count;
            return -1;
        }
    }
}
