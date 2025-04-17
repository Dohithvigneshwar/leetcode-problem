import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {
    class Solution {
//     public int[][] merge(int[][] intervals) {
//         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
//         Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
// 		for(int i=0;i<intervals.length;i++) {
// 			ArrayList<Integer> temp = new ArrayList<>();
// 			for(int j=0;j<intervals[0].length;j++) {
// 				temp.add(intervals[i][j]);
// 			}
// //			stack.add(temp);
// 			if(!stack.isEmpty()) {
// 				int s = stack.peek().get(0);
// 				int e = stack.peek().get(1);
// 				int s1 = temp.get(0);
// 				int e1 = temp.get(1);
// 				if(e>=s1) {
// 					 stack.peek().set(1,Math.max(e, e1));
// 				}
// 				else {
// 					stack.add(temp);
// 				}
// 			}
// 			else {
// 				stack.push(temp);
// 			}
// 		}
// 		int res[][]= new int[stack.size()][2];
//         int start = stack.size()-1;
//         while(start>=0){
//             res[start][0] = stack.peek().get(0);
//             res[start][1] = stack.peek().get(1);
//             stack.pop();
//             start--;
//         }
//     	return res;
//     }

        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,(e1, e2)->Integer.compare(e1[0],e2[0]));
            ArrayList<int []> ans = new ArrayList<>();
            for(int e[] : intervals) {
                if(ans.isEmpty() || ans.get(ans.size()-1)[1] < e[0]) {
                    ans.add(new int[] {e[0],e[1]});
                }
                else {
                    int temp[] = ans.get(ans.size()-1);
                    ans.removeLast();
                    temp[1] = Math.max(temp[1],e[1]);
                    ans.add(temp);
                }
            }
            int a[][] = new int[ans.size()][2];
            int i=0;
            for(int e[]:ans){
                a[i][0] = e[0];
                a[i][1] = e[1];
                i++;
            }
            return a;
        }
    }
}
