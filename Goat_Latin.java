public class Goat_Latin {
    class Solution {
        public static String toGoatLatin(String sentence) {
            int i = 0;
            String ans = "";
            String a[] = sentence.split("\\s+");
            for(String e : a){
                String temp = "ma";
                char fc = e.charAt(0);
                if(!isVowvel(""+fc)){
                    e = e.substring(1);
                    temp = fc+temp;
                }
                e+=temp;
                for(int j=0;j<=i;j++){
                    e+="a";
                }
                ans += e+" ";
                i++;
            }
            return ans.trim();
        }
        public static boolean isVowvel(String  s){
            String v = "aeiouAEIOU";
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(v.contains(""+c)){
                    return true;
                }
            }
            return false;
        }
    }
}
