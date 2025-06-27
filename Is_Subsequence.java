public class Is_Subsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int st = 0;
            for(int i=0;i<s.length();i++){
                boolean flag = true;
                for(int j=st;j<t.length();j++){
                    if(s.charAt(i) == t.charAt(j)){
                        st = j+1;
                        flag = false;
                        break;
                    }
                }
                if(flag) return false;
            }
            return true;
        }
    }
}
