class Solution {
    private int[][] dp;
    private int m;
    private int n;

    private int solve(int[][] grid, int i, int j) {
        if (i == m - 1) return grid[i][j];
        if (dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;
        for (int k = 0; k < n; k++) {
            if (k != j) {
                min = Math.min(min, solve(grid, i + 1, k));
            }
        }

        dp[i][j] = grid[i][j] + min;
        return dp[i][j];
    }

    public int minFallingPathSum(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        dp = new int[m][n]; 
        int res =Integer.MAX_VALUE;
        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }
         for(int j = 0; j < n; ++j) {
            dp[0][j] = grid[0][j];
        }

        for(int i = 1; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                int temp = Integer.MAX_VALUE;

                for(int k = 0; k < n; ++k) {
                    if(j != k) {
                        temp = Math.min(temp, grid[i][j] + dp[i - 1][k]);
                    }

                    dp[i][j] = temp;
                }
            }
        }

        for(int j = 0; j < n; ++j) {
            res = Math.min(res, dp[n - 1][j]);
        }

        return res;
    }
}

