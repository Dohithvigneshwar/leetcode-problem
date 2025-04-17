public class Median_of_Two_Sorted_Arrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length+nums2.length;
            boolean even = false;
            if(n%2==0){
                even = true;
            }
            double ans = 0;
            int temp[] = new int[n];
            int k = 0;
            int i=0,j=0;
            while(i<nums1.length && j<nums2.length) {
                if(nums1[i]<nums2[j]) {
                    temp[k] = nums1[i];
                    k++;
                    i++;
                }
                else {
                    temp[k] = nums2[j];
                    k++;
                    j++;
                }
            }
            while(i<nums1.length) {
                temp[k++] = nums1[i++];
            }
            while(j<nums2.length) {
                temp[k++] = nums2[j++];
            }
            int mid = n/2;
            if(even) {
                double a = temp[mid];
                double b = temp[mid-1];
                ans = (a+b)/2;
            }
            else {
                ans = temp[mid];
            }
            return ans;
        }
    }
}
