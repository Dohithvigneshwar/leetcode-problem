public class Convert_Sorted_Array_to_Binary_Search_Tree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return insert(nums,0,nums.length-1);
        }
        private TreeNode insert(int nums[],int l,int r){
            if(l>r) return null;
            int mid = (l+r)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = insert(nums,l,mid-1);
            node.right = insert(nums,mid+1,r);
            return node;
        }
    }
}
