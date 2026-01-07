public class Maximum_Product_of_Splitted_Binary_Tree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int maxProduct(TreeNode root) {
            long tot = totalSum(root);
            //    System.out.println(tot);
            long a[] = new long[]{0};
            maxSplitValue(root,tot,a);
            return (int)(a[0] % 1000000007);
        }
        long maxSplitValue(TreeNode node, long tot,long a[]){
            if(node == null) return 0;
            long left = maxSplitValue(node.left,tot,a);
            long right = maxSplitValue(node.right,tot,a);
            long sum = left + right + node.val;
            // System.out.println(left+" "+right+" "+sum);
            a[0] = Math.max(a[0], (tot-sum) * sum);
            return sum;

        }
        long totalSum(TreeNode node){
            if(node == null) return 0;
            return node.val + totalSum(node.left) + totalSum(node.right);
        }
    }
}
