import java.util.ArrayList;

public class Check_If_Digits_Are_Equal_in_String_After_Operations_I {
    class Solution {
        public boolean hasSameDigits(String s) {
            if(s.length()<2){
                return false;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(char c:s.toCharArray()){
                list.add(c-'0');
            }
            while(list.size()!=2){
                for(int i=0;i<list.size()-1;i++){
                    int a = list.get(i);
                    int b = list.get(i+1);
                    int c = (a+b)%10;
                    list.set(i,c);
                    if(i==list.size()-2) {
                        list.remove(list.size() - 1);
                    }
                }
            }
            return list.get(0) == list.get(1) ? true : false;
        }
    }
}
