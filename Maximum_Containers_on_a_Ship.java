public class Maximum_Containers_on_a_Ship {
    class Solution {
        public int maxContainers(int n, int w, int maxWeight) {
            n = n*n;
            int value = n*w;
            System.out.println(value);
            if(value<=maxWeight) return n;
            while(value>maxWeight){
                value -= w;
                n--;
            }
            return n;
        }
    }
}
