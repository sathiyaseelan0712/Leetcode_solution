class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void dfs(int[][] graph, int node, List<Integer> cur){
        cur.add(node);
        if(node == graph.length-1){
            ans.add(new ArrayList<>(cur));
        }else{
            for(int val : graph[node]){
                dfs(graph,val,cur);
            }
        }
        cur.remove(cur.size() - 1);
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph,0,new ArrayList<>());
        return ans;
    }
}
