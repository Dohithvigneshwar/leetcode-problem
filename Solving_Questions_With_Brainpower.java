import java.util.Arrays;

public class Solving_Questions_With_Brainpower {
    class Solution {
        public long mostPoints(int[][] questions) {
            long dp[] = new long[questions.length];
            Arrays.fill(dp,-1);
            return maxPoint(questions,0,0,dp);
        }
        public long maxPoint(int a[][],int index,int point,long dp[]){
            if(index>=a.length) return point;
            if(dp[index]!=-1) return dp[index];
            long take = maxPoint(a,index+1+a[index][1],point+a[index][0],dp);
            long nottake = maxPoint(a,index+1,point,dp);
            return dp[index]=Math.max(take,nottake);
        }
    }
}
