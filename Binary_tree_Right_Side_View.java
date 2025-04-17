import java.util.ArrayList;
import java.util.List;

public class Binary_tree_Right_Side_View {

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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null){
                return list;
            }
            leftview(list,root,0);
            // Queue<TreeNode> queue = new LinkedList<>();
            // queue.add(root);
            // while(queue.isEmpty()==false) {
            // 	int size = queue.size();
            // 	List<Integer> temp = new ArrayList<>();
            // 	for(int i=0;i<size;i++) {
            // 		TreeNode r = queue.remove();
            // 		temp.add(r.val);
            // 		if(r.left!=null) {
            // 			queue.add(r.left);
            // 		}
            // 		if(r.right!=null) {
            // 			queue.add(r.right);
            // 		}
            // 	}
            // 	list.add(temp.get(temp.size()-1));
            // }
            return list;
        }
        public void leftview(List<Integer> list, TreeNode node, int h) {
            if(node == null) {
                return;
            }
            if(h == list.size()) {
                list.add(node.val);
            }
            leftview(list,node.right,h+1);
            leftview(list,node.left,h+1);
        }
    }
}
