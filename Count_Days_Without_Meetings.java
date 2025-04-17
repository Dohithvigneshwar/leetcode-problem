import java.util.Arrays;

public class Count_Days_Without_Meetings {
    class Solution {
        public int countDays(int days, int[][] meetings) {
            Arrays.sort(meetings,(x, y) -> (x[0]-y[0]));
            for(int e[] : meetings) System.out.println(Arrays.toString(e));
            int s = meetings[0][0];
            int e = meetings[0][1];
            int count = 0;
            for(int i=1;i<meetings.length;i++){
                int newstart = meetings[i][0];
                int newend = meetings[i][1];
                if(newstart>=s && newstart<=e){
                    e = Math.max(e,newend);
                }
                else{
                    count += (e-s+1);
                    s = newstart;
                    e = newend;
                }
            }
            count += (e-s+1);
            return days-count;
        }
    }
}
