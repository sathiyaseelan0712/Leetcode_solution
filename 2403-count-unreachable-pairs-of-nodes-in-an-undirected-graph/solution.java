class Solution {
    long cnt = 0;
    public long countPairs(int n, int[][] edges) {        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++) graph.add(new ArrayList<>());
        
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // System.out.println(graph);

        Set<Integer> set = new HashSet<>();
        long res = 0;
        for(int node = 0;node<n;node++){
            if(!set.contains(node)){
                cnt = 0;
                solve(graph, node, set);
                // System.out.println(cnt);
                res += (cnt * (n - cnt));
            }
        }
        return res/2;
    }

    public void  solve(ArrayList<ArrayList<Integer>>  graph, int node, Set<Integer> set){
        if(set.contains(node)) return;
        set.add(node);
        cnt+=1;
        for(int tempNode : graph.get(node)){
            if(!set.contains(tempNode)){
                solve(graph,tempNode, set);
            }
        }
    }
}
