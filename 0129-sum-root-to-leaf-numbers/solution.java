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
    private  void dfs(TreeNode root, int res){
        if(root == null) return;
        // System.out.println(res + " "  + sum);
        if(root.left == null && root.right == null){
            sum += (res * 10) + root.val;
        }
        dfs(root.left,res*10+root.val);
        dfs(root.right,res*10+root.val);
    }
    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }
}
