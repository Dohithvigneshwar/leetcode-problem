import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node_II {
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


    class Solution {
        public Node connect(Node root) {
            if(root == null) return root;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int n = queue.size();
                List<Node> list = new ArrayList<>();
                for(int i=0;i<n;i++){
                    Node rem = queue.remove();
                    if(rem.left != null) queue.add(rem.left);
                    if(rem.right != null) queue.add(rem.right);
                    list.add(rem);
                }
                for(int i=0;i<list.size();i++){
                    if(i == list.size()-1) continue;
                    list.get(i).next = list.get(i+1);
                }
            }
            return root;
        }
    }
}
