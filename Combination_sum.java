import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> list = new ArrayList<>();
            for(int i=0;i<candidates.length;i++){
                List<Integer> temp = new ArrayList<>();
                temp.add(candidates[i]);
                recursion(candidates,i,temp,list,target);
                temp.remove(0);
            }
            return list;
        }
        public void recursion(int a[],int index,List<Integer> temp,List<List<Integer>> list,int target){
            int ans = sum(temp);
            if(ans>target){
                return;
            }
            if(ans == target){
                List<Integer> Ans = new ArrayList<>();
                for(int e:temp){
                    Ans.add(e);
                }
                list.add(Ans);
            }
            temp.add(a[index]);
            recursion(a,index,temp,list,target);
            temp.remove(temp.size()-1);
            for(int i=index+1;i<a.length;i++){
                temp.add(a[i]);
                recursion(a,i,temp,list,target);
                temp.remove(temp.size()-1);
            }
        }
        public int sum(List<Integer> list){
            int sum = 0;
            for(int e:list){
                sum+=e;
            }
            return sum;
        }
    }
}
