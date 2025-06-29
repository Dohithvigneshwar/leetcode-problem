import java.util.HashMap;
import java.util.Map;

public class Ransom_Note {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i=0;i<ransomNote.length();i++){
                char c = ransomNote.charAt(i);
                if(map1.containsKey(c)) map1.put(c,map1.get(c)+1);
                else map1.put(c,1);
            }
            for(int i=0;i<magazine.length();i++){
                char c = magazine.charAt(i);
                if(map2.containsKey(c)) map2.put(c,map2.get(c)+1);
                else map2.put(c,1);
            }
            for(Map.Entry<Character,Integer> data : map1.entrySet()){
                if(!map2.containsKey(data.getKey())) return false;
                if(map2.get(data.getKey()) < data.getValue()) return false;
            }
            return true;
        }
    }
}
