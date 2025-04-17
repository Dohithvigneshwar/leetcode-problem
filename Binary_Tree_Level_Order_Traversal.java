import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            if(root == null) return list;
            while(queue.isEmpty()==false){
                List<Integer> list1 = new ArrayList<>();
                int size = queue.size();
                for(int i=0;i<size;i++){
                    TreeNode temp = queue.remove();
                    if(temp.left != null){
                        queue.add(temp.left);
                    }
                    if(temp.right != null){
                        queue.add(temp.right);
                    }
                    list1.add(Integer.valueOf(temp.val));
                }
                list.add(list1);
            }
            return list;
        }
    }
}
