class Solution {
    class Pair {
        int node;
        int distance;

        Pair(int _node, int _distance) {
            node = _node;
            distance = _distance;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : times) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.get(u).add(new int[] { v, w });
        }
        // System.out.println(graph);
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = Integer.MIN_VALUE;
        distance[k] = 0;
        PriorityQueue<Pair> qu = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        qu.offer(new Pair(k, 0));
        while (!qu.isEmpty()) {
            Pair cur = qu.poll();
            int node = cur.node;
            int dis = cur.distance;
            // System.out.println(node + " "  + dis);
            for (int[] nei : graph.get(node)) {
                int v = nei[0];
                int wt = nei[1];
                if (dis + wt < distance[v]) {
                    distance[v] = dis + wt;
                    qu.offer(new Pair(v, distance[v]));
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i : distance) {
            // System.out.print(i + "");
            max = Math.max(max, i);
            // if(i == Integer.MAX_VALUE) return -1;
        }
        if (max == Integer.MAX_VALUE)
            return -1;
        return max;
    }
}
