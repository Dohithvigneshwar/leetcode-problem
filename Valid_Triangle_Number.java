import java.util.Arrays;

public class Valid_Triangle_Number {
    class Solution {
        public int triangleNumber(int[] nums) {
            int count = 0;
            // for(int i=0;i<nums.length;i++){
            // for(int j=i+1;j<nums.length;j++){
            //         for(int k=j+1;k<nums.length;k++){
            //             int a = nums[i];
            //             int b = nums[j];
            //             int c = nums[k];
            //             if((a+b>c) && (a+c>b) && (b+c>a)){
            //                 count++;
            //             }
            //         }
            //     }
            // }
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++){
                for(int j=i+1;j<nums.length-1;j++){
                    int k = j+1;
                    while(k<nums.length && nums[i]+nums[j]>nums[k]){
                        count++;
                        k++;
                    }
                }
            }
            return count;

        }
    }
}
