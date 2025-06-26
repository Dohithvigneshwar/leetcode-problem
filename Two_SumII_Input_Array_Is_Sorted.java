public class Two_SumII_Input_Array_Is_Sorted {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int ans[] = new int[2];
            int left = 0,right = numbers.length-1;
            while(left<=right){
                int sum = numbers[left] + numbers[right];
                if(target == sum){
                    if(left != right){
                        ans[0] = left+1;
                        ans[1] = right+1;
                    }
                    else{
                        ans[0] = left+1;
                    }
                    break;
                }
                else if(target > sum){
                    left++;
                }
                else{
                    right--;
                }
            }
            return ans;
        }
    }
}
