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

    static class NodePair {
        int height;
        boolean balanced;

        public NodePair(int height, boolean balanced) {
            this.height = height;
            this.balanced = balanced;
        }
    }

    NodePair isBalanceHelper(TreeNode root) {
        if (root == null) {
            return new NodePair(0, true);
        }

        NodePair leftInfo = isBalanceHelper(root.left);
        NodePair rightInfo = isBalanceHelper(root.right);

        boolean isCurrTreeBalanced = leftInfo.balanced == true && rightInfo.balanced == true && Math.abs(leftInfo.height - rightInfo.height) <= 1;

        int currTreeHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new NodePair(currTreeHeight, isCurrTreeBalanced);
    }

    public boolean isBalanced(TreeNode root) {
        return isBalanceHelper(root).balanced;
    }
}
