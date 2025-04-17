import java.util.ArrayList;

public class Validate_Binary_Search_Tree {
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
        public boolean isValidBST(TreeNode root){
            dfs(root);
            // System.out.println(list);
            for(int i=1;i<list.size();i++){
                if(list.get(i)<=list.get(i-1)) return false;
            }
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        public void dfs(TreeNode node){
            if(node == null) return;
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
        }
    }
}
