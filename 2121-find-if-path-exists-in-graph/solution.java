class Solution {
    public void dfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visit){
        visit[start] = true;
        for(int val : graph.get(start)){
            if(!visit[val]){
                dfs(val,graph, visit);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0],v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visit = new boolean[n];
        dfs(source, graph, visit);
        return visit[destination];
    }
}
