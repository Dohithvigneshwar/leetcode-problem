public class Count_and_Say{
    public static void main(String[] args){
        class Solution {
            public String countAndSay(int n) {
                if(n == 1){
                    return "1";
                }
                StringBuffer sb = new StringBuffer("1");
                for(int t=1;t<n;t++){
                    StringBuffer temp = new StringBuffer();
                    int count = 0;
                    char c = sb.charAt(0);
                    for(int i=0;i<sb.length();i++){
                        if(c == sb.charAt(i)) count++;
                        else{
                            temp.append(count);
                            temp.append(c);
                            count = 1;
                            c = sb.charAt(i);
                        }
                    }
                    temp.append(count);
                    temp.append(c);
                    sb = temp;
                }
                return ""+sb;
            }
        }
    }
}