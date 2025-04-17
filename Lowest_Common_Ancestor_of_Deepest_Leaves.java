import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Lowest_Common_Ancestor_of_Deepest_Leaves {


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
        public TreeNode lcaDeepestLeaves(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<TreeNode> list = new ArrayList<>();
            queue.add(root);
            int h = height(root);
            int count = 0;
            while(!queue.isEmpty()){
                count++;
                int size = queue.size();
                for(int i=0;i<size;i++){
                    TreeNode rem = queue.remove();
                    if(count == h){
                        list.add(rem);
                    }
                    if(rem.left!=null) queue.add(rem.left);
                    if(rem.right!=null) queue.add(rem.right);
                }
            }
            if(list.size()==1) return list.get(0);
            return lca(root,list.get(0),list.get(list.size()-1));
        }
        public int height(TreeNode node){
            if(node == null) return 0;
            return Math.max(1+height(node.left),1+height(node.right));
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
