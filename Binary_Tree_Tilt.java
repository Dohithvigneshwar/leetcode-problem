public class Binary_Tree_Tilt {
    class Solution {
        private int totalTilt = 0;

        protected int valueSum(TreeNode node) {
            if (node == null)
                return 0;

            int leftSum = this.valueSum(node.left);
            int rightSum = this.valueSum(node.right);
            int tilt = Math.abs(leftSum - rightSum);
            totalTilt += tilt;
            return node.val + leftSum + rightSum;
        }

        public int findTilt(TreeNode root) {
            totalTilt = 0;
            valueSum(root);
            return totalTilt;
        }
    }
}
