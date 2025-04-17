public class Kth_Smallest_Element_in_a_BST {
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
        int ans = -1;
        public int kthSmallest(TreeNode root, int k) {
            int ans[] = new int[1];
            int k1[] = new int[1];
            k1[0] = k;
            helper(root,k1,ans);
            return ans[0];
        }
        public void helper(TreeNode node,int k[],int ans[]){
            if(node == null){
                return;
            }
            helper(node.left,k,ans);
            k[0]--;
            if(k[0] == 0){
                ans[0] = node.val;
            }
            helper(node.right,k,ans);
        }
    }
}
