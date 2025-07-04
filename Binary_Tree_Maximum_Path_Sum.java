public class Binary_Tree_Maximum_Path_Sum {
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
        int a = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            maxPath(root);
            return a;
        }
        private int maxPath(TreeNode node){
            if(node == null) return 0;
            int left = Math.max(0,maxPath(node.left));
            int right = Math.max(0,maxPath(node.right));
            a = Math.max(a,left+right+node.val);
            return node.val+Math.max(left,right);
        }
    }
}
