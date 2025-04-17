import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generate_Parentheses {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> answer = new ArrayList<>();
            int open = 0;
            int close = 0;
            recursion("",n,answer,open,close);
            return answer;
        }
        public boolean isValid(String s){
            if(s.length()%2!=0){
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c=='('){
                    stack.add(')');
                }
                else{
                    if(stack.isEmpty()) return false;
                    if(stack.pop() != c){
                        return false;
                    }
                }
            }
            if(stack.isEmpty()) return true;
            return false;
        }
        public void recursion(String s, int n, List<String> answer, int open, int close){
            if(open > n || close > n){
                return;
            }
            if(s.length()==n+n){
                if(isValid(s)){
                    answer.add(s);
                }
                return;
            }
            recursion(s+"(",n,answer,open+1,close);
            recursion(s+")",n,answer,open,close+1);
        }
    }
}
