public class Word_Pattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            HashMap<Character,String> map1 = new HashMap<>();
            HashMap<String,Character> map2 = new HashMap<>();
            String a[] = s.split("\\s+");
            if(a.length != pattern.length()) return false;
            int i = 0;
            for(String data : a){
                char c = pattern.charAt(i++);
                if(map1.containsKey(c)){
                    if(!map1.get(c).equals(data)) return false;
                }
                else if(map2.containsKey(data)){
                    if(map2.get(data) != c) return false;
                }
                else{
                    map1.put(c,data);
                    map2.put(data,c);
                }
            }
            return true;
        }
    }
}
