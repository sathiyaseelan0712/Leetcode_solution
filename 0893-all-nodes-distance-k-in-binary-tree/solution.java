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
    private Map<TreeNode, TreeNode> map = new HashMap<>();
    private void markParent(TreeNode root){
        if(root == null) return;
        if(root.left != null){
            map.put(root.left,root);
            markParent(root.left);
        }
        if(root.right != null){
            map.put(root.right,root);
            markParent(root.right);
        }
    }
    public void bfs(TreeNode target,int k, List<Integer> res){
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        q.offer(target);
        visited.add(target);

        while(!q.isEmpty()){
            int size = q.size();
            if(k==0) break;
            for(int i = 0;i<size;i++){
                TreeNode curr = q.poll();
                
                if(curr.left != null  && !visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right != null  && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                if(map.containsKey(curr) && !visited.contains(map.get(curr))){
                    q.offer(map.get(curr));
                    visited.add(map.get(curr));
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        markParent(root);
        bfs(target,k,res);
        return res;
    }
}
