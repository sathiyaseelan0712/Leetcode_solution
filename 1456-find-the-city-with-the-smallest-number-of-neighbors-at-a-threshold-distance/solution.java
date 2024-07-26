class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i]=0;
        }
        for(int[] v:edges){
            dist[v[0]][v[1]] = v[2];
            dist[v[1]][v[0]] = v[2];
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k]<Integer.MAX_VALUE && dist[k][j]<Integer.MAX_VALUE){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        int count=n;
        int ccity=-1;
        for(int city=0;city<n;city++){
            int cnt=0;
            for(int adcity=0;adcity<n;adcity++){
                if(dist[city][adcity]<=distanceThreshold)
                    cnt++;
            }
            if(cnt<=count){
                count=cnt;
                ccity=city;
            }
        }
        return ccity;
    }
}
