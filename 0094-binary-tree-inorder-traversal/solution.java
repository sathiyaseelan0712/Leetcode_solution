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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>(); 
        
        TreeNode cur = root;

        
        while(true){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode temp = stack.pop();
            res.add(temp.val);
            cur = temp.right;
        }
        return res;
    }
}
