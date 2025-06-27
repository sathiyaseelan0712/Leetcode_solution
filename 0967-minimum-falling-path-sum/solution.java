class Solution {
    int m, n;
    public int solve(int[][] arr, int i, int j, int[][] dp){
        if (j < 0 || j >= n) return (int)1e9;
        if (i == m - 1) return arr[i][j];
        if (dp[i][j] != -1) return dp[i][j];

        int left = solve(arr, i + 1, j - 1, dp);
        int down = solve(arr, i + 1, j, dp);
        int right = solve(arr, i + 1, j + 1, dp);

        return dp[i][j] = arr[i][j] + Math.min(left, Math.min(down, right));
    }

    public int minFallingPathSum(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        // int[][] dp = new int[m][n];
        // for (int i = 0; i < m; i++) {
        //     Arrays.fill(dp[i], -1);
        // }

        // int min = Integer.MAX_VALUE;
        // for (int j = 0; j < n; j++) {
        //     min = Math.min(min, solve(matrix, 0, j, dp));
        // }
        // return min;
        for(int i = m-2 ;i >=0;i--){
            for(int j = 0;j<n;j++){
                int mid =  matrix[i+1][j];
                int left = (j > 0) ? matrix[i+1][j-1] : Integer.MAX_VALUE;
                int right =  (j < n-1) ? matrix[i+1][j+1] : Integer.MAX_VALUE;

                matrix[i][j] = matrix[i][j] + Math.min(mid, Math.min(left,right));
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i : matrix[0]){
            result = Math.min(i,result);
        }
        return result;
    }
}
