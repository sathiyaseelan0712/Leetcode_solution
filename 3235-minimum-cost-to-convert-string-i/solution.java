class Solution {
    public long minimumCost(String source, String target, char[] or, char[] ch, int[] cost) {
        int n=source.length();
        int m=or.length;
        int[][] graph=new int[26][26];
        for(int[] row:graph){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        for(int i=0;i<m;i++){
            int x=or[i]-'a';
            int y=ch[i]-'a';
            graph[x][y]=Math.min(graph[x][y],cost[i]);
        }
        for(int i=0;i<26;i++){
            graph[i][i]=0;
        }
        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(graph[i][k]!=Integer.MAX_VALUE && graph[k][j]!=Integer.MAX_VALUE){
                        graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
                    }
                }
            }
        }
        long sum=0;
        for(int i=0;i<n;i++){
            int x=source.charAt(i)-'a';
            int y=target.charAt(i)-'a';
            if(graph[x][y]==Integer.MAX_VALUE)
                return -1;
            else
                sum+=graph[x][y];
        }
        return sum;
    }
}
