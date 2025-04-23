public class Count_Largest_Group {
    class Solution {
        public int countLargestGroup(int n) {
            int a[] = new int[37];
            int max = 0;
            for(int i=1;i<=n;i++){
                int n1 = sumOfDigit(i);
                a[n1]++;
                max = Math.max(max,a[n1]);
            }
            int count = 0;
            for(int i=0;i<37;i++){
                if(a[i] == max) count++;
            }
            return count;
        }
        public int sumOfDigit(int n){
            int sum = 0;
            while(n!=0){
                sum += n%10;
                n/=10;
            }
            return sum;
        }
    }
}
