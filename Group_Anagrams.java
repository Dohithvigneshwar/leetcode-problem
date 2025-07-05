import java.util.ArrayList;
import java.util.List;

public class Group_Anagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ans = new ArrayList<>();
            for(int i=0;i<strs.length;i++){
                if(strs[i].equals("-1")) continue;
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(strs[j].equals("-1")) continue;
                    if(isAnagram(strs[i],strs[j])){
                        temp.add(strs[j]);
                        strs[j] = "-1";
                    }
                }
                ans.add(temp);
                strs[i] = "-1";
            }
            return ans;
        }
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()) return false;
            int count[] = new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }
            for(int i=0;i<26;i++){
                if(count[i] != 0) return false;
            }
            return true;
        }
    }
}
