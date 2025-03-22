class Solution {
    public int solve(int n,Map<Integer,Integer> dp){
        if(n==0|| n==1) return n;
        if(n == 2 ) return 1;
        else if(dp.containsKey(n)) return dp.get(n);
        int value = solve(n-1,dp) + solve(n-2,dp) + solve(n-3,dp);
        dp.put(n,value);
        return value;
    }
    public int tribonacci(int n) {
        Map<Integer,Integer> arr= new HashMap<>();
        return solve(n,arr);
    }
}
