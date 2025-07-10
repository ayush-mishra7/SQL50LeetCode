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
    boolean hasPath(TreeNode root, int targetSum, int curSum) {
        if (root == null)
        {
            return false;
        }
        curSum+=root.val;
        //leaf
        if (root.right == null && root.left == null) {
            if(curSum==targetSum)
            {
                return true;
            }
            else{
                return false;
            }

        } else if (root.left == null && root.right != null) {
            return hasPath(root.right,targetSum,curSum);

        } else if (root.left != null && root.right == null) {
            return hasPath(root.left,targetSum,curSum);

        } else {
            return hasPath(root.left,targetSum,curSum) ||hasPath(root.right,targetSum,curSum);
               
        }

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPath(root, targetSum, 0);
    }
}