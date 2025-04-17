public class Lemonade_Change {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int a_5 = 0 , a_10 = 0, a_20 = 0;
            for(int amount : bills){
                if(amount == 5) a_5++;
                else if(amount == 10){
                    if(a_5 == 0) return false;
                    a_5--;
                    a_10++;
                }
                else{
                    if(a_10 > 0 && a_5 > 0){
                        a_5--;
                        a_10--;
                    }
                    else if(a_5 >2){
                        a_5-=3;
                    }
                    else{
                        return false;
                    }
                    a_20++;
                }
            }
            return true;
        }
    }
}
