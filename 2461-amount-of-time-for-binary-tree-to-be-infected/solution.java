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
//     private Map<TreeNode, TreeNode> map = new HashMap<>();

//     private void markParent(TreeNode root) {
//         if (root == null)
//             return;
//         if (root.left != null) {
//             map.put(root.left, root);
//             markParent(root.left);
//         }
//         if (root.right != null) {
//             map.put(root.right, root);
//             markParent(root.right);
//         }
//     }

//    private TreeNode findNode(TreeNode root, int val) {
//         if (root == null) return null;
//         if (root.val == val) return root;
//         TreeNode left = findNode(root.left, val);
//         if (left != null) return left;
//         return findNode(root.right, val);
//     }

//     public int bfs(TreeNode root){
//         if(root == null) return 0;
//         Queue<TreeNode> q = new LinkedList<>();
//         Set<TreeNode> set = new HashSet<>();
//         q.offer(root);
//         set.add(root);
//         int ans = -1;
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i = 0;i<size;i++){
//                 TreeNode cur = q.poll();
//                 if(cur.left != null && !set.contains(cur.left)){
//                     q.offer(cur.left);
//                     set.add(cur.left);
//                 }
//                 if(cur.right != null && !set.contains(cur.right)){
//                     q.offer(cur.right);
//                     set.add(cur.right);
//                 }
//                 if(map.containsKey(cur) && !set.contains(map.get(cur))){
//                     q.offer(map.get(cur));
//                     set.add(map.get(cur));
//                 }
//             }
//             ans++;
//         }
//         return ans;
//     }
    private int maxTime = 0;
    public int amountOfTime(TreeNode root, int start) {
       find(root,start);
       return maxTime;
    }

    private int find(TreeNode root, int target){
        if(root == null) return -1;
        if(root.val == target){
            dfs(root,0);
            return 1;
        }
        int left = find(root.left, target);
        if(left > 0){
            dfs(root.right, left+1);
            maxTime = Math.max(maxTime,left);
            return left + 1;
        }
        int right =find(root.right,target);
        if(right > 0){
            dfs(root.left,right+1);
            maxTime = Math.max(maxTime,right);
            return 1 + right;
        }
        return -1;
    }
    private void dfs(TreeNode node, int time){
        if(node == null) return;
        maxTime = Math.max(maxTime,time);
        dfs(node.left,time+1);
        dfs(node.right,time+1);
    }
}
