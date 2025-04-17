public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {


     public class TreeNode {
        int val;
       TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return null;
            }
            TreeNode node = root;
            while(node != null){
                if(node.val<p.val && node.val<q.val){
                    node = node.right;
                }
                else if(node.val>p.val && node.val>q.val){
                    node = node.left;
                }
                else{
                    return node;
                }
            }
            return node;
        }
    }
}
