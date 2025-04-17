import java.util.Arrays;

public class Coin_Change {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int dp[][] = new int[coins.length+1][amount+1];
            for(int e[] : dp) Arrays.fill(e,-1);
            int coin = minCoin(coins,0,amount,dp);
            return coin == Integer.MAX_VALUE-1 ? -1 : coin;
        }
        public int minCoin(int coins[],int index,int amount,int dp[][]){
            if(index == coins.length || amount<0) return Integer.MAX_VALUE-1;
            if(amount == 0) return 0;
            if(dp[index][amount]!=-1) return dp[index][amount];
            int take = 1 + minCoin(coins,index,amount-coins[index],dp);
            int nottake = minCoin(coins,index+1,amount,dp);
            return dp[index][amount] = Math.min(take,nottake);
        }
    }
}
