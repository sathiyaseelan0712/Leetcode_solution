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
    private Map<TreeNode, TreeNode> map = new HashMap<>();

    private void markParent(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            map.put(root.left, root);
            markParent(root.left);
        }
        if (root.right != null) {
            map.put(root.right, root);
            markParent(root.right);
        }
    }

   private TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        TreeNode left = findNode(root.left, val);
        if (left != null) return left;
        return findNode(root.right, val);
    }

    public int bfs(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> set = new HashSet<>();
        q.offer(root);
        set.add(root);
        int ans = -1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                TreeNode cur = q.poll();
                if(cur.left != null && !set.contains(cur.left)){
                    q.offer(cur.left);
                    set.add(cur.left);
                }
                if(cur.right != null && !set.contains(cur.right)){
                    q.offer(cur.right);
                    set.add(cur.right);
                }
                if(map.containsKey(cur) && !set.contains(map.get(cur))){
                    q.offer(map.get(cur));
                    set.add(map.get(cur));
                }
            }
            ans++;
        }
        return ans;
    }

    public int amountOfTime(TreeNode root, int start) {
        TreeNode getTarget = findNode(root, start);
        markParent(root);
        return bfs(getTarget);
    }
}
