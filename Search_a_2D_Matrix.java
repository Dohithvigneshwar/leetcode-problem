public class Search_a_2D_Matrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int s = 0;
            int e = matrix.length*matrix[0].length-1;
            int r = matrix[0].length;
            while(s<=e){
                int mid = (s+e)/2;
                int i = mid/r;
                int j = mid%r;
                if(matrix[i][j] == target) return true;
                else if(matrix[i][j]<target) s = mid+1;
                else e = mid-1;
            }
            return false;
        }
    }
}
