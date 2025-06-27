class Solution {
    int m;
    int n;
    int[][] dp;
    List<List<Integer>> arr;
    public int solve(int i, int  j){
        // if(i < 0 || j < 0 || i >= m || j >= n) return Integer.MAX_VALUE;
        // System.out.println(arr.get(i).get(j) + " " + i + " " +j);
        if(i == m-1) return arr.get(i).get(j);
        if(dp[i][j] != -1) return dp[i][j];
        int val = arr.get(i).get(j) + Math.min(solve(i+1,j), solve(i+1,j+1));
        dp[i][j] = val;
        return val;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        arr = triangle;
        m = triangle.size();
        n = triangle.get(m-1).size();
        dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0);
        // return dp[0][0];
    }
}
