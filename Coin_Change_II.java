import java.util.Arrays;

public class Coin_Change_II {
    class Solution {
        public int change(int amount, int[] coins) {
            int dp[][] = new int[coins.length][amount+1];
            for(int e[] : dp) Arrays.fill(e,-1);
            return changeCoin(coins.length-1,0,coins,amount,dp);
        }
        public int changeCoin(int index,int target,int coins[],int amount,int dp[][]){
            if(target == amount) return 1;
            if(index == -1 || target>amount) return 0;
            if(dp[index][target] != -1) return dp[index][target];
            int take = changeCoin(index,target+coins[index],coins,amount,dp);
            int nottake = changeCoin(index-1,target,coins,amount,dp);
            return dp[index][target] = take+nottake;
        }
    }
}
