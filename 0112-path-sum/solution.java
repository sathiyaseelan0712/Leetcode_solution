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
    private boolean dfs(TreeNode root, int tSum,int cSum){
        if(root == null) return false;
        cSum += root.val;
        if(root.left == null && root.right == null && tSum == cSum){
            return true;
        }
        return dfs(root.left, tSum, cSum) || dfs(root.right, tSum, cSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum,0);
    }
}
