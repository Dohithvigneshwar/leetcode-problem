public class Reverse_Word_In_a_String {
    class Solution {
        public String reverseWords(String s) {
            String ans[] = s.split("\\s+");
            StringBuffer sb = new StringBuffer();
            for(int i=ans.length-1;i>=0;i--){
                if(!ans[i].isEmpty()) sb.append(ans[i]+" ");
            }
            return sb.toString().trim();
        }
    }}
