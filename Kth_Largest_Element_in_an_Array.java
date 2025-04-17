import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y-x);
            for(int i=0;i<nums.length;i++) queue.add(nums[i]);
            for(int i=0;i<k-1;i++) queue.remove();
            return queue.peek();
        }
    }
}
