public record Find_First_and_Last_Position_of_Element_in_Sorted_Array() {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int a[] = new int[2];
            if(nums.length==0) {
                a[0] =  -1;
                a[1] = -1;
                return a;
            }
            if(nums.length == 1 && nums[0] == target) {
                a[0] = 0;
                a[0] = 0;
                return a;
            }
            int l = binaryLeft(nums,target);
            int r = binaryRight(nums,target);
            a[0] = l;
            a[1] = r;
            return a;
        }
        public int binaryLeft(int a[],int target) {
            int s = 0;
            int e = a.length-1;
            int res = -1;
            while(s<=e) {
                int mid = (s+e)/2;
                if(a[mid] == target) {
                    res = mid;
                }
                if(a[mid]<target) {
                    s = mid+1;
                }
                else {
                    e = mid-1;
                }
            }
            return res;
        }
        public int binaryRight(int a[],int target) {
            int s = 0;
            int e = a.length-1;
            int res = -1;
            while(s<=e) {
                int mid = (s+e)/2;
                if(a[mid] == target) {
                    res = mid;
                }
                if(a[mid]<=target) {
                    s = mid+1;
                }
                else {
                    e = mid-1;
                }
            }
            return res;
        }
    }
}
