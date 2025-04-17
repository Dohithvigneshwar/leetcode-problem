import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Zigzag_Level_OrdeR_Traversal {
    public class TreeNode {
        int val;
        Binary_Tree_Inorder_Traversal.TreeNode left;
        Binary_Tree_Inorder_Traversal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Binary_Tree_Inorder_Traversal.TreeNode left, Binary_Tree_Inorder_Traversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            if(root == null) return list;
            Deque<TreeNode> deque = new LinkedList<>();
            deque.addFirst(root);
            boolean flag = true;
            while(!deque.isEmpty()) {
                int size = deque.size();
                List<Integer> temp = new ArrayList<>();
                for(int i=0;i<size;i++) {
                    if(flag) {
                        TreeNode node = deque.removeFirst();
                        if(node.left!=null) {
                            deque.addLast(node.left);
                        }
                        if(node.right!=null) {
                            deque.addLast(node.right);
                        }
                        temp.add(node.val);
                    }
                    else {
                        TreeNode node = deque.removeLast();
                        if(node.right!=null) {
                            deque.addFirst(node.right);
                        }
                        if(node.left!=null) {
                            deque.addFirst(node.left);
                        }
                        temp.add(node.val);
                    }
                }
                list.add(temp);
                if(flag) flag = false;
                else flag = true;
            }
            return list;
        }
    }
}
