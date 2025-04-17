public class Invert_Binary_Tree {

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
        public TreeNode invertTree(TreeNode root) {
            root = helper(root);
            return root;
        }
        public TreeNode helper(TreeNode node){
            if(node == null) {
                return null;
            }
            TreeNode left = invertTree(node.left);
            TreeNode right = invertTree(node.right);
            node.left = right;
            node.right = left;
            // if(left == null && right != null) {
            // 	node.left = right;
            //     node.right = null;
            //     return node;
            // }
            // if(left != null && right == null) {
            // 	node.right = left;
            //     node.left = null;
            //     return node;
            // }
            // if(left!=null && right!=null){
            // 	TreeNode temp = node.left;
            // 	node.left = node.right;
            // 	node.right = temp;
            //     return node;
            // }
            return node;
        }
    }
}
