import java.util.Arrays;

public class Fibonacci_Number {
    class Solution {
        public int fib(int n) {
            int dp[] = new int[n+1];
            Arrays.fill(dp,-1);
            dp[n] = back(n,dp);
            return dp[n];
        }
        public int back(int n,int dp[]){
            if(dp[n]!=-1) return dp[n];
            if(n<=1) return n;
            return dp[n] = back(n-1,dp)+back(n-2,dp);
        }
    }
}
