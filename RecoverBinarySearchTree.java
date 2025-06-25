public class RecoverBinarySearchTree {
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
        private TreeNode pre = null;
        private TreeNode first = null;
        private TreeNode second = null;
        public void recoverTree(TreeNode root) {
            if(root == null) return;
            inOrder(root);
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
        private void inOrder(TreeNode root){
            if(root == null) return;
            inOrder(root.left);
            if(pre != null && pre.val > root.val){
                if(first == null){
                    first = pre;
                    second = root;
                }
                else{
                    second = root;
                }
            }
            pre = root;
            inOrder(root.right);
        }
    }
}
