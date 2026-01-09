import java.util.ArrayList;
import java.util.LinkedList;

public class Smallest_Subtree_with_all_the_DeepestNodes {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<TreeNode> list = new ArrayList<>();
            queue.add(root);
            // int h = height(root);
            // int count = 0;
            while(!queue.isEmpty()){
                list.clear();
                // count++;
                int size = queue.size();
                for(int i=0;i<size;i++){
                    TreeNode rem = queue.remove();
                    // if(count == h){
                    //     list.add(rem);
                    // }
                    list.add(rem);
                    if(rem.left!=null) queue.add(rem.left);
                    if(rem.right!=null) queue.add(rem.right);
                }
            }
            if(list.size()==1) return list.get(0);
            return lca(root,list.get(0),list.get(list.size()-1));
        }
        public TreeNode lca(TreeNode node,TreeNode p,TreeNode q){
            if(node == null || node == p || node == q) return node;
            TreeNode left = lca(node.left,p,q);
            TreeNode right = lca(node.right,p,q);
            if(left != null && right != null) return node;
            return left == null ? right : left;
        }
    }
}
