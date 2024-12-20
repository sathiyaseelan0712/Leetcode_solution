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
    public TreeNode reverseOddLevels(TreeNode root) {
        levelTra(root.left,root.right,0);
        return root;
    }
    private void levelTra(TreeNode n1, TreeNode n2, int l){
        if(n1==null || n2 == null)
            return;
        
        System.out.println(n1.val);
        System.out.println(n2.val);
        if(l%2==0){
            int val = n1.val;
            n1.val = n2.val;
            n2.val = val;
        }
        System.out.println(n1.val);
        System.out.println(n2.val);
        levelTra(n1.left,n2.right,l+1);
        levelTra(n1.right,n2.left,l+1);
    }
}
