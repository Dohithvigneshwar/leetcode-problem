import java.util.HashSet;
import java.util.Set;

public class Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct {
    class Solution {
        public int minimumOperations(int[] nums) {
            if(uniqueElement(nums,0)) return 0;
            int count = 0 ;
            int start = 0;
            while(start < nums.length){
                start += 3;
                count ++;
                if(uniqueElement(nums,start)) break;
            }
            return count;

        }
        private boolean uniqueElement(int nums[],int start){
            Set<Integer> set = new HashSet<>();
            for(int i=start;i<nums.length;i++){
                if(set.contains(nums[i])) return false;
                set.add(nums[i]);
            }
            return true;
        }
    }
}
