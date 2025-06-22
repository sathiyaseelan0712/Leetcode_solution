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
    class Pair{
        int index;
        TreeNode node;
        Pair(){}
        Pair(int _idx, TreeNode _node){
            index = _idx;
            node = _node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root == null) return 0;
        q.offer(new Pair(1,root));
        
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().index;
            int first = 0,last = 0;
            for(int i = 0;i<size;i++){
                Pair cur = q.poll();
                int curIdx = cur.index - min;
                if(i==0) first = cur.index;
                if(i == size -1) last = cur.index;
                if(cur.node.left != null){
                    q.offer(new Pair(2 * curIdx, cur.node.left));
                }if(cur.node.right != null){
                    q.offer(new Pair(2 * curIdx + 1, cur.node.right));
                }
            }   
            ans =Math.max(ans, last - first +1);
        }
        return ans;
    }
}
