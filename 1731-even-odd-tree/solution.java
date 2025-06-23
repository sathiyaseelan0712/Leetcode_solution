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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        boolean isOdd = false;
        while(!qu.isEmpty()){
            int n = qu.size();
            int prev = isOdd ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                TreeNode cur = qu.poll();
                if(isOdd){
                    if(cur.val % 2 != 0 || prev <= cur.val) return false;
                }else{
                    if(cur.val % 2 == 0 || prev >= cur.val) return false;
                }
                prev = cur.val;

                if(cur.left != null) qu.offer(cur.left);
                if(cur.right != null) qu.offer(cur.right);
            }
            isOdd = !isOdd;
        }
        return true;
    }
}
