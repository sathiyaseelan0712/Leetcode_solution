class Solution {
    public int solve(int[][] arr, int m ,int n, int i,int j,int[][] dp){
        if(i >= m || j >= n || arr[i][j] == 1) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(arr,m,n,i+1,j,dp) + solve(arr,m,n,i,j+1,dp);
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(arr,m,n,0,0,dp);
    }
}
