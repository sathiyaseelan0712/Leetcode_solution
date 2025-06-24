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
    List<List<Integer>> res = new ArrayList<>();

    public void dfs(TreeNode root, int tSum, List<Integer> curr){
        if(root == null) return;

        tSum -= root.val;
        curr.add(root.val);

        if(root.left == null && root.right == null && tSum == 0){
            res.add(new ArrayList<>(curr));
        }

        dfs(root.left,tSum,curr);
        dfs(root.right,tSum,curr);
        curr.remove(curr.size()-1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int tSum) {
        dfs(root,tSum,new ArrayList<>());
        return res;
    }
}
