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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int count = q.size();
            while(count != 0){
                TreeNode curr = q.remove();
                // if(curr.val != )
                ans.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                --count;
            }
            result.add(ans);   
        }
        return result;
    }
}
