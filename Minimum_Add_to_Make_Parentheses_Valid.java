public class Minimum_Add_to_Make_Parentheses_Valid {
    class Solution {
        public int minAddToMakeValid(String s) {
            int open_needed = 0;
            int close_needed = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    close_needed++;
                }
                else{
                    if(close_needed>0) close_needed--;
                    else open_needed++;
                }
            }
            return open_needed+close_needed;
        }
    }
}
