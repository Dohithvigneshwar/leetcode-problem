import java.util.PriorityQueue;
public class Find_Subsequence_of_Length_K_With_the_Largest_Sum {
    class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            PriorityQueue<Pair> queue = new PriorityQueue<>((x, y) -> y.value - x.value);
            for(int i=0;i<nums.length;i++){
                queue.add(new Pair(nums[i],i));
            }
            PriorityQueue<Pair> queue1 = new PriorityQueue<>((x,y) -> x.pos - y.pos);
            for(int i=0;i<k;i++) queue1.add(queue.remove());
            int res[] = new int[k];
            for(int i=0;i<k;i++) res[i] = queue1.remove().value;
            return res;
        }
        class Pair{
            int value,pos;
            public Pair(int value,int pos){
                this.value = value;
                this.pos = pos;
            }
        }
    }
}
