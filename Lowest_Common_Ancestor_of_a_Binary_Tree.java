public class Lowest_Common_Ancestor_of_a_Binary_Tree {
//    public class TreeNode {
//        int val;
//        Lowest_Common_Ancestor_of_Deepest_Leaves.TreeNode left;
//        Lowest_Common_Ancestor_of_Deepest_Leaves.TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, Lowest_Common_Ancestor_of_Deepest_Leaves.TreeNode left, Lowest_Common_Ancestor_of_Deepest_Leaves.TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return root;
            return findLCA(root,p,q);
        }
        public TreeNode findLCA(TreeNode node,TreeNode p,TreeNode q){
            if(node == null || node == p || node == q) return node;
            TreeNode left = findLCA(node.left,p,q);
            TreeNode right = findLCA(node.right,p,q);
            if(left != null && right != null) return node;
            return left == null ? right : left;
        }
    }
}
