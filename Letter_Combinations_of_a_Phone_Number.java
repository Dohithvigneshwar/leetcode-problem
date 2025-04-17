import java.util.ArrayList;
import java.util.List;
public class Letter_Combinations_of_a_Phone_Number {
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if(digits.isEmpty()) return ans;
            String a[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            combination(digits,"",a,ans,0);
            return ans;
        }
        public void combination(String n, String p, String a[], List<String> ans, int pos){
            if(p.length() == n.length()){
                ans.add(p);
                return;
            }
            int index = n.charAt(pos)-'0';
            for(int i=0;i<a[index].length();i++){
                char c = a[index].charAt(i);
                combination(n,p+c,a,ans,pos+1);
            }
        }
    }
}
