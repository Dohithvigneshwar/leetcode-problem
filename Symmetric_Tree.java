import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_Tree {
    public class TreeNode {
        int val;
        Same_Tree.TreeNode left;
        Same_Tree.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Same_Tree.TreeNode left, Same_Tree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root.left);
            queue.add(root.right);
            while(queue.isEmpty()==false) {
                TreeNode l = queue.remove();
                TreeNode r = queue.remove();
                if(l == null && r == null) {
                    continue;
                }
                if(l==null || r == null) {
                    return false;
                }
                if(l.val != r.val){
                    return false;
                }
                queue.add(l.left);
                queue.add(r.right);
                queue.add(l.right);
                queue.add(r.left);
            }
            return true;
        }
    }
}
