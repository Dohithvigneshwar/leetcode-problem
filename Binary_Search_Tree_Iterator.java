import java.util.Stack;

public class Binary_Search_Tree_Iterator {
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
    class BSTIterator {
        Stack<TreeNode> stack = new Stack<>();
        public BSTIterator(TreeNode root) {
            stack.push(root);
            TreeNode temp = root.left;
            while(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
        }
        public int next() {
            TreeNode rem = stack.pop();
            if(rem.right != null){
                stack.push(rem.right);
                TreeNode temp = rem.right.left;
                while(temp!=null){
                    stack.push(temp);
                    temp = temp.left;
                }
            }
            return rem.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
}
