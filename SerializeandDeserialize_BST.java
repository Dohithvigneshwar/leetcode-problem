public class SerializeandDeserialize_BST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root == null) return "";
            StringBuffer sb = new StringBuffer();
            inOrder(root,sb);
            return sb.substring(0,sb.length()-1);
        }
        private void inOrder(TreeNode node,StringBuffer sb){
            if(node == null) return;
            sb.append(""+node.val+",");
            inOrder(node.left,sb);
            inOrder(node.right,sb);
        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.isEmpty()) return null;
            System.out.println(data);
            String d[] = data.split(",");
            // System.out.println(Arrays.toString(d));
            TreeNode root = new TreeNode(Integer.parseInt(d[0]));
            for(int i=1;i<d.length;i++){
                int value = Integer.parseInt(d[i]);
                root = insert(root,value);
            }
            return root;
        }
        private TreeNode insert(TreeNode node,int data){
            if(node == null) return new TreeNode(data);
            if(node.val>data) node.left = insert(node.left,data);
            else node.right = insert(node.right,data);
            return node;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
}
