public class Maximum_Depth_of_Binary_Tree {
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
        int max = -1;
        public int maxDepth(TreeNode root) {
            if(root == null) return 0;
            helper(root,0);
            return max+1;
        }
        public void helper(TreeNode node,int count){
            if(node == null){
                return;
            }
            if(max<count) max = count;
            helper(node.left,count+1);
            helper(node.right,count+1);
        }
    }
}
