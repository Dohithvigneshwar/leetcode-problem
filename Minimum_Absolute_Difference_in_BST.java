import java.util.ArrayList;
import java.util.List;

public class Minimum_Absolute_Difference_in_BST {

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
        public int getMinimumDifference(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            inOrder(root,list);
            int min = Integer.MAX_VALUE;
            for(int i=1;i<list.size();i++) min = Math.min(min,Math.abs(list.get(i) - list.get(i-1)));
            return min;
        }
        public static void inOrder(TreeNode node,List<Integer> list){
            if(node == null) return;
            inOrder(node.left,list);
            list.add(node.val);
            inOrder(node.right,list);
        }
    }
}
