import java.util.Arrays;

public class Non_overlapping_Intervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals,(x, y) -> (x[1] - y[1]));
            int start = intervals[0][0];
            int end = intervals[0][1];
            int count = 0;
            for(int i=1;i<intervals.length;i++){
                if(end<=intervals[i][0]){
                    start = intervals[i][0];
                    end = intervals[i][1];
                }
                else{
                    count++;
                }
            }
            return count;
        }
    }
}
