class Solution {
    // private int solve(int i,int j,int n,int m,int[][] arr){
    //     if(i>=n || j>=m) return 0;
    //     if(i == n - 1 && j == m-1) return 1;
    //     if(arr[i][j] != -1) return arr[i][j];
    //     return arr[i][j] = solve(i+1,j,n,m,arr) + solve(i,j+1,n,m,arr);
    //     // return arr[i][j];
    // }
    public int uniquePaths(int m, int n) {
        // int[][] arr = new int[m][n];
        // for(int i = 0;i<m;i++){
        //     for(int j = 0;j<n;j++){
        //         arr[i][j] = -1;
        //     }
        // }
        // return solve(0,0,m,n,arr);
        int N = m+n-2;
        int r = m-1;
        double res =1;
        for(int i = 1;i<=r;i++){
            res = res*(N-r+i)/i;
        }
        return (int)res;
    }
}
