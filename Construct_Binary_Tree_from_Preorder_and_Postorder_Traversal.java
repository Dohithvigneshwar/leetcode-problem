import java.util.HashMap;

public class Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
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
        boolean varray[];
        int index = 0;
        public void initialize(int size){
            varray = new boolean[size];
        }
        public TreeNode constructFromPrePost(int[] preorder, int[] postorder){
            initialize(preorder.length);
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<postorder.length;i++){
                map.put(postorder[i],i);
            }
            int s = map.get(preorder[0]);
            return helper(preorder,map,s);
        }
        private TreeNode helper(int preorder[], HashMap<Integer,Integer> map, int currentindex){
            if(currentindex<0){
                return null;
            }
            if(varray[currentindex]){
                return null;
            }
            int element = preorder[index];
            index++;
            TreeNode node  = new TreeNode(element);
            int newindex = map.get(element);
            varray[newindex] = true;
            node.left = helper(preorder,map,newindex-1);
            node.right = helper(preorder,map,newindex-1);
            return node;
        }
    }
}
