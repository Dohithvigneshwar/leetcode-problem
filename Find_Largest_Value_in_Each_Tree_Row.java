import java.util.ArrayList;
import java.util.List;

public class Find_Largest_Value_in_Each_Tree_Row {
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
        public List<Integer> largestValues(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            helper(root,list,0);
            return list;
        }
        public static void helper(TreeNode node, ArrayList<Integer> list, int count){
            if(node == null){
                return;
            }
            if(count == list.size()){
                list.add(node.val);
            }
            else{
                int data = list.get(count);
                list.set(count,Math.max(node.val,data));
            }
            helper(node.left,list,count+1);
            helper(node.right,list,count+1);

        }
    }
}
