public class Diameter_of_Binary_Tree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
      }
    class Solution {
        int max = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            diameter(root,0);
            return max-1;
        }
        public int diameter(TreeNode node,int c){
            if(node == null){
                return 0;
            }
            int l = diameter(node.left,c+1);
            int r = diameter(node.right,c+1);
            if(max<l+r+1){
                max = l+r+1;
            }
            return Math.max(l,r)+1;
        }

    }
}
