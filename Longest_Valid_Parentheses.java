public class Longest_Valid_Parentheses {
    class Solution {
        public int longestValidParentheses(String s) {
            int open = 0,close = 0,max=0;
            int n = s.length();
            for(int i=0;i<n;i++){
                char c = s.charAt(i);
                if(c == '('){
                    open+=1;
                }
                else{
                    close+=1;
                }
                if(open == close){
                    max = Math.max(max,open*2);
                }
                if(open<close){
                    open = 0;
                    close = 0;
                }
            }
            open = 0;
            close = 0;
            for(int i=n-1;i>=0;i--){
                char c = s.charAt(i);
                if(c == '('){
                    open+=1;
                }
                else{
                    close+=1;
                }
                if(open == close){
                    max = Math.max(max,open*2);
                }
                if(open>close){
                    open = 0;
                    close = 0;
                }
            }
            return max;
        }
    }
}
