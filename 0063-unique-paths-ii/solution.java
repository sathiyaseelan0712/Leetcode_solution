class Solution {
    public int solve(int i, int j, Map<String, Integer> dp, int m, int n, int[][] o) {
        if (j >= m || i >= n)
            return 0;
        if (o[i][j] == 1)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;

        String key = i + " " + j;

        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int val = solve(i + 1, j, dp, m, n, o) + solve(i, j + 1, dp, m, n, o);
        dp.put(key, val);
        return val;
    }

    public int uniquePathsWithObstacles(int[][] o) {
        Map<String, Integer> dp = new HashMap<>();
        int x = 0, y = 0;
        int n = o.length;
        int m = o[0].length;
        if (o[0][0] == 1 || o[n-1][m-1] == 1 )
            return 0;
        return solve(0, 0, dp, m, n, o);
    }
}
