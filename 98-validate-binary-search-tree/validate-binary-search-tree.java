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
    public boolean solve(TreeNode root, long lowerBound, long upperBound) {
        if (root == null) {
            return true;
        }
        
        boolean cond1= (root.val > lowerBound);
        boolean cond2= (root.val < upperBound);
        
        boolean leftAns= solve(root.left, lowerBound, root.val);
        boolean rightAns= solve(root.right, root.val, upperBound);
        
        return (cond1 && cond2 && leftAns && rightAns);
    }

    public boolean isValidBST(TreeNode root) {
        long lowerBound= Long.MIN_VALUE;
        long upperBound= Long.MAX_VALUE;
        return solve(root, lowerBound, upperBound);
    }
}