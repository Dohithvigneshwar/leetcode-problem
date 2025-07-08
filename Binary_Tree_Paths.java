import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans = new ArrayList<>();
            preOrder(root,ans,"");
            return ans;
        }
        private void preOrder(TreeNode node,List<String> ans,String temp){
            if(node == null) return;
            if(node.left == null && node.right == null){
                ans.add(temp+""+node.val);
                return;
            }
            preOrder(node.left,ans,temp+node.val+"->");
            preOrder(node.right,ans,temp+node.val+"->");
        }

    }
}
