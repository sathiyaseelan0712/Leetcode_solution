class Solution {
    private int cnt = 0;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<=n;i++) graph.add(new ArrayList<>());
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(isConnected[i][j] == 1){
                    graph.get(i+1).add(j+1);
                    graph.get(j+1).add(i+1);
                }
            }
        }
        // System.out.println(graph);
        Set<Integer> set = new HashSet<>();
        
        for(int node = 1;node<=n;node++){
            if(!set.contains(node)){
                cnt++;
                solve(graph,node,set);
            }
        }
        return cnt;
        
    }

    public void solve(ArrayList<ArrayList<Integer>> graph, int node,Set<Integer> set){
        if(set.contains(node)) return;
        set.add(node);
        for(int tempNode : graph.get(node)){
            if(!set.contains(tempNode)){
                solve(graph,tempNode,set);
            }
        }
    }
}
