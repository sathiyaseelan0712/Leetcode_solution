class Solution {
    public int solve(int i,int j,Map<String,Integer> dp,int m,int n){
        if( j >=n || i>=m ) return 0;
        if(i == m-1 || j== n-1) return 1;
        String key = i +" "+j;
        if(dp.containsKey(key)) return dp.get(key);
        int val = solve(i+1,j,dp,m,n) + solve(i,j+1,dp,m,n);
        dp.put(key,val);
        return val;
    }
    public int uniquePaths(int m, int n) {
        Map<String,Integer> dp = new HashMap<>();
        return solve(0,0,dp,m,n);
    }
}
