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
    private int sum = 0;
    private void dfs(TreeNode node, boolean isLeft){
        if(node == null) return;
        if(node.left == null && node.right == null && isLeft){
            sum += node.val;
            return;
        }
        dfs(node.left,true);
        dfs(node.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        // if(root == null) return 0;
        // Queue<TreeNode> q = new LinkedList<>();
        // int sum = 0;
        // q.offer(root);

        // while(!q.isEmpty()){
        //     int n  = q.size();
        //     for(int i = 0;i<n;i++){
        //         TreeNode cur = q.poll();
        //         if(cur.left != null && cur.left.left == null && cur.left.right == null){
        //             sum += cur.left.val;
        //         }
        //         if(cur.left !=null) q.offer(cur.left);
        //         if(cur.right != null) q.offer(cur.right);
        //     }
        // }
        // return sum;
        dfs(root,false);
        return sum;
    }
}
