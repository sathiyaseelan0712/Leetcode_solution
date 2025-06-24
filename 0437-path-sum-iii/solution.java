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
    private int cnt = 0;
    public void dfs(TreeNode root, long rem){
        if(root == null) return;
        if(rem == root.val){
            cnt++;
        }
        dfs(root.left,rem - root.val);
        dfs(root.right,rem - root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        dfs(root,(long)targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return cnt;
    }
}
