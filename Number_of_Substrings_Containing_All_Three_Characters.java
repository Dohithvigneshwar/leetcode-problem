public class Number_of_Substrings_Containing_All_Three_Characters {
    class Solution {
        public int numberOfSubstrings(String s) {
            int a[] = {-1,-1,-1};
            int count = 0;
            for(int i=0;i<s.length();i++){
                int pos = s.charAt(i) - 97;
                a[pos] = i;
                count+=Math.min(a[0],Math.min(a[1],a[2]))+1;
            }
            return count;
        }
    }
}
