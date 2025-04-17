public class Cousins_in_Binary_Tree {

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
        public boolean isCousins(TreeNode node, int x,int y) {
            if(node == null) {
                return false;
            }
            TreeNode xnode = findNode(node,x);
            TreeNode ynode = findNode(node,y);

            return(
                    levelOf(node,x,0) == levelOf(node,y,0) && (!sib(xnode,ynode,node))
            );
        }
        public TreeNode findNode(TreeNode node,int value) {
            if(node == null) {
                return null;
            }
            if(node.val == value) {
                return node;
            }
            TreeNode temp = findNode(node.left,value);
            if(temp!=null) {
                return temp;
            }
            return findNode(node.right,value);
        }
        public int levelOf(TreeNode node,int x,int level) {
            if(node == null) {
                return 0;
            }
            if(node.val == x) {
                return level;
            }
            int currentCount = levelOf(node.left,x,level+1);
            if(currentCount!=0) {
                return currentCount;
            }
            return levelOf(node.right,x,level+1);
        }
        public boolean sib(TreeNode x,TreeNode y,TreeNode node) {
            if(node == null) {
                return false;
            }
            return (
                    node.left == x && node.right == y ||
                            node.right == x && node.left == y ||
                            sib(x,y,node.left) || sib(x,y,node.right)
            );
        }
    }
}
