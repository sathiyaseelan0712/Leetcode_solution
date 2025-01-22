class Solution {
    public int solve(int i, int j,int m,int n,Map<String,Integer> dp,int[][] g){
        String key = i + " " + j;
        if(i>=n || j>=m) return Integer.MAX_VALUE;
        if( i== n-1 && j==m-1) return g[i][j];
        if(dp.containsKey(key)) return dp.get(key);
        int val= g[i][j]+Math.min(solve(i+1,j,m,n,dp,g) , solve(i,j+1,m,n,dp,g));
        dp.put(key,val);
        return val;
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Map<String,Integer> dp = new HashMap<>();
        return solve(0,0,m,n,dp,grid);

    }
}
