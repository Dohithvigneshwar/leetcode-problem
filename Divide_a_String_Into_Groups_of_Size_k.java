import java.util.ArrayList;

public class Divide_a_String_Into_Groups_of_Size_k {
    class Solution {
        public String[] divideString(String s, int k, char fill) {
            int e = k;
            List<String> list = new ArrayList<>();
            while(!s.isEmpty()){
                if(s.length()>=k){
                    list.add(s.substring(0,k));
                    s = s.substring(k);
                }
                else{
                    while(s.length()!=k) s = s+(""+fill);
                    list.add(s);
                    break;
                }
            }
            String ans[] = new String[list.size()];
            for(int i=0;i<ans.length;i++) ans[i] = list.get(i);
            return ans;
        }
    }
}
