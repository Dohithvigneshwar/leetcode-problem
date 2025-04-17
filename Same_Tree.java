public class Same_Tree {
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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null){
                return true;
            }
            // if(p == null || q == null){
            //     return false;
            // }
            return helper(p,q);
        }
        public boolean helper(TreeNode n1,TreeNode n2){
            if(n1 == null && n2 == null){
                return true;
            }
            if(n1 != null && n2 == null || n1 == null && n2 != null){
                return false;
            }
            if(n1.val != n2.val){
                return false;
            }
            boolean left = helper(n1.left,n2.left);
            if(!left){
                return false;
            }
            return helper(n1.right,n2.right);
        }
    }
}
