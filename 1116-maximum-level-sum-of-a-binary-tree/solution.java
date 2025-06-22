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
    public int maxLevelSum(TreeNode root) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int level = 0;
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null) return -1;
        qu.offer(root);

        while(!qu.isEmpty()){
            int sum = 0;
            level++;
            int size = qu.size();
            while(size != 0){
                TreeNode cur = qu.poll();
                sum += cur.val;
                if(cur.left != null) qu.offer(cur.left);
                if(cur.right != null) qu.offer(cur.right);
                size--;
                System.out.println(sum);
            }
            if(max < sum){
                max = sum;
                ans = level;
            }
        }
        return ans;
    }
}
