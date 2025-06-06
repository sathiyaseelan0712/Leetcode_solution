int solve(int n,int* dp){
    if(n==0||n==1) return n;
    else if(dp[n] != -1) return dp[n];
    else return dp[n] = solve(n-1,dp) + solve(n-2,dp);
}
int fib(int n){
    int dp[n+1];
    memset(dp,-1,sizeof(dp));
    return solve(n,dp);
}
