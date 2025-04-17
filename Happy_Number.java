public class Happy_Number {
    class Solution {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;
            do{
                int temp = findvalue(fast);
                fast = findvalue(temp);
                slow = findvalue(slow);
                if(slow == 1) return true;
            }
            while(fast!=slow);
            if(slow == 1){
                return true;
            }
            return false;
        }
        public int findvalue(int n){
            int sum = 0;
            while(n>0){
                int rem=n%10;
                sum+= (rem*rem);
                n/=10;
            }
            return sum;
        }
    }
}
