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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();

        if(root == null) return -1;
        qu.offer(root);

        while(!qu.isEmpty()){
            int size = qu.size();
            long sum = 0;
            while(size != 0){
                TreeNode cur = qu.poll();
                sum += cur.val;
                if(cur.left != null) qu.offer(cur.left);
                if(cur.right != null) qu.offer(cur.right);
                size--; 
            }
            res.add(sum);
        }
        if (k > res.size()) return -1; 
        Collections.sort(res, Collections.reverseOrder());
        return res.get(k-1);
    }
}
