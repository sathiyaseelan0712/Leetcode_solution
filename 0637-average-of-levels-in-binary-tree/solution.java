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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null) return res;
        qu.offer(root);
            // System.out.println(qu);
        while(!qu.isEmpty()){
            long sum = 0;
            int cnt = qu.size();
            int size = cnt;
            while(size != 0){
                TreeNode cur = qu.poll();
                sum += cur.val;
                if(cur.left != null) qu.offer(cur.left); 
                if(cur.right != null) qu.offer(cur.right); 
                size--;
            }
            res.add(sum * 1.0 / cnt);
        }
        return res;
    }
}
