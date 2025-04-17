import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Level_in_Binary_Tree {

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
        public List<Double> averageOfLevels(TreeNode root) {
            ArrayList<Double> ans = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(queue.isEmpty()==false) {
                int size = queue.size();
                double avg = 0;
                for(int i=0;i<size;i++) {
                    TreeNode r = queue.remove();
                    avg+=r.val;
                    if(r.left!=null) {
                        queue.add(r.left);
                    }
                    if(r.right!=null) {
                        queue.add(r.right);
                    }
                }
                ans.add(avg/size);
            }
            return ans;
        }
    }
}
