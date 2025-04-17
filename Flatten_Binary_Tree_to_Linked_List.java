public class Flatten_Binary_Tree_to_Linked_List {

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
        public void flatten(TreeNode root) {
            if(root  == null) return;
            reversePreOrder(root);
        }
        TreeNode pre = null;
        public void reversePreOrder(TreeNode node){
            if(node == null) return;
            reversePreOrder(node.right);
            reversePreOrder(node.left);
            node.right = pre;
            node.left = null;
            pre = node;
        }
    }
}
