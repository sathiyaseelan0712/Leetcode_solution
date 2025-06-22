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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();

        if(root == null) return res;
        qu.offer(root);
        boolean isLeftTORight = false;

        while(!qu.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int size = qu.size();
            while(size != 0){
                TreeNode cur = qu.poll();
                ans.add(cur.val);
                if(cur.left != null) qu.offer(cur.left);
                if(cur.right != null) qu.offer(cur.right);
                size--;
            }
            if(isLeftTORight){
                Collections.reverse(ans);
            }
            isLeftTORight = !isLeftTORight;
            res.add(ans);
        }
        return res;
    }
}
