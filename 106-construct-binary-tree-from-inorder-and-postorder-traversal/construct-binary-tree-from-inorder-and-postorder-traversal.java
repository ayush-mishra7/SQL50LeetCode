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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        HashMap<Integer, Integer> valueInorderIndexMap = new HashMap<>();
        int n = inorder.length;
        for(int idx=0; idx < n; ++idx){
            valueInorderIndexMap.put(inorder[idx], idx);
        }

        TreeNode completeTree = buildTreeHelper(postorder, inorder, 0, n-1, 0, n-1,  valueInorderIndexMap);
        return completeTree;
    }

    public TreeNode buildTreeHelper(int[] postorder, int[] inorder, int postStart, int postEnd,int inStart, int inEnd, HashMap<Integer, Integer> valueInorderIndexMap){
        
        if(postStart > postEnd || inStart>inEnd){
            return null;
        }
        int rootNodeValue = postorder[postEnd];

        TreeNode root = new TreeNode(rootNodeValue);
        int inorderIndex = valueInorderIndexMap.get(rootNodeValue);
        int countRightSubTreeNodes = inEnd - inorderIndex;

        root.left = buildTreeHelper(postorder, inorder, postStart, 
postEnd - countRightSubTreeNodes-1, inStart, inorderIndex - 1, valueInorderIndexMap);
        root.right = buildTreeHelper(postorder, inorder, postStart - countRightSubTreeNodes, postEnd-1, inorderIndex + 1, inEnd, valueInorderIndexMap);
        
        return root;
    }
}