class Solution {
    public int solve(int n, Map<Integer,Integer> dp){
        if(n == 1 || n == 2) return n;
        else if(dp.containsKey(n)) return dp.get(n);
        int value = solve(n-1,dp) + solve(n-2,dp);
        dp.put(n,value);
        return value;
    }
    public int climbStairs(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        return solve(n,map); 
    }
}
