class Solution {
    private int[][] dp;
    public int solve(int[][] grid, int m,int n,int i,int j){
        if(i < 0 || j < 0 || i>= m || j >= n) return Integer.MAX_VALUE;
        if(i == m-1 && j == n-1) return grid[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int val = grid[i][j] + Math.min(solve(grid,m,n,i+1,j), solve(grid,m,n,i,j+1));
        dp[i][j] = val;
        return val;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[grid.length][grid[0].length];
        for(int[] row  : dp){
            Arrays.fill(row,-1);
        }
        return solve(grid,m,n,0,0);
        // return dp[m-1][n-1];
    }
}
