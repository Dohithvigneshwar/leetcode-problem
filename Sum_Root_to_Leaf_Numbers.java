public class Sum_Root_to_Leaf_Numbers {
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
        public int sumNumbers(TreeNode root) {
            preOrder(root,0);
            return sum;
        }
        int sum = 0;
        public void preOrder(TreeNode node,int n){
            if(node.left == null  && node.right == null){
                sum += n+node.val;
                return;
            }
            if(node.left !=null) preOrder(node.left,(n+node.val)*10);
            if(node.right !=null) preOrder(node.right,(n+node.val)*10);
        }
    }

}
