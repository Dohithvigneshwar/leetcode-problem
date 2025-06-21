import java.util.LinkedList;

public class Serialize_and_Deserialize_Binary_Tree {
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
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode rem = queue.remove();
                if(rem == null) sb.append("-1001,");
                else{
                    sb.append(""+rem.val+",");
                    queue.add(rem.left);
                    queue.add(rem.right);
                }
            }
            return (sb.toString());
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            // System.out.println(data);
            if(data.isEmpty()) return null;
            // System.out.println(data);
            String a[] = data.split(",");
            int len = a.length-1;
            int pos = 1;
            TreeNode root = new TreeNode(Integer.parseInt(a[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty() && pos<len){
                TreeNode rem = queue.remove();
                int d = Integer.parseInt(a[pos]);
                if(d != -1001){
                    rem.left = new TreeNode(d);
                    queue.add(rem.left);
                }
                pos++;
                d = Integer.parseInt(a[pos]);
                if(pos<len && d!=1001){
                    rem.right = new TreeNode(d);
                    queue.add(rem.right);
                }
                pos++;
            }
            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
}
