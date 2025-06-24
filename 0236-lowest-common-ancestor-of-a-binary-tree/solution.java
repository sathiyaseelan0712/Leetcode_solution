/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // private Map<TreeNode,TreeNode> map = new HashMap<>();
    // private void markParent(TreeNode root){
    //     if(root == null) return;
    //     if(root.left != null){
    //         map.put(root.left, root);
    //         markParent(root.left);
    //     }
    //     if(root.right != null){
    //         map.put(root.right,root);
    //         markParent(root.right);
    //     }
    // }
    public boolean find(TreeNode root,TreeNode target,List<TreeNode> path){
        if(root == null) return false;
        path.add(root);
        if(root == target) return true;

        if(find(root.left, target, path) || find(root.right, target,path)) return true;

        path.remove(path.size() - 1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // markParent(root);
        // Set<TreeNode> set = new HashSet<>();
        // while(p != null && set.add(p)){
        //     p = map.get(p);
        // }
        // while(q != null && set.add(q)){
        //     q = map.get(q);
        // }
        // return q;
        // List<TreeNode> path1 = new ArrayList<>();
        // List<TreeNode> path2 = new ArrayList<>();

        // if(!find(root.left,target,path1) || !find(root.right,target,path2)) return null;

        // int i = 0;
        // while( i < path1.size()  && i < path2.size()){
        //     if(path1[i] != path2[i]) break;
        //     i++;
        // }
        // return path1.get(path1.size()-1);
        if(root == null || root == p  || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null) return root;
        if(left != null && right == null) return left;
        if(left == null && right != null) return right;
        return null;
    }
}
