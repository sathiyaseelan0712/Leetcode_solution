class Solution {
    public int solve(int n,int[] arr){
        if(n==0 || n==1) return n;
        else if(arr[n] != -1) return arr[n];
        else return arr[n] = solve(n-1,arr) + solve(n-2,arr);
    }
    public int fib(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<n+1;i++){
            arr[i] = -1;
        }
        return solve(n,arr);
    }
}
