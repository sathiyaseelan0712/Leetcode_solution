class Solution {
    public int solve(int n, Map<Integer,Integer> dp) {
        if (n == 1 || n==2 ) return n;
        else if (dp.containsKey(n)) return dp.get(n);
        else {
            dp.put(n, solve(n - 1, dp) + solve(n - 2, dp));
            return dp.get(n);
        }
    }

    public int climbStairs(int n) {
        Map<Integer, Integer> dp = new HashMap<>();
        return solve(n, dp);
    }
}
