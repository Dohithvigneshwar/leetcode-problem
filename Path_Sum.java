public class Path_Sum {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
             this.right = right;
          }
      }
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null){
                return false;
            }
            root = helper(root,targetSum,0);
            return flag;
        }
        boolean flag = false;
        public TreeNode helper(TreeNode node,int target,int currentSum){
            if(node == null){
                return node;
            }
            currentSum+=node.val;
            if(target == currentSum){
                if(node.left == null && node.right == null) flag = true;
            }
            TreeNode left = helper(node.left,target,currentSum);
            if(left != null){
                currentSum -= node.val;
                return node;
            }
            return helper(node.right,target,currentSum);
        }
    }
}
