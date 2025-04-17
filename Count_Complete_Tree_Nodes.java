

public class Count_Complete_Tree_Nodes {
//
//      Definition for a binary tree node.
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
        int count = 0;
        public int countNodes(TreeNode root) {
            preOrder(root);
            return count;
        }
        public void preOrder(TreeNode node){
            if(node == null) return;
            count++;
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
