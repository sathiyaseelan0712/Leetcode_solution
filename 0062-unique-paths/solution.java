class Solution {
    // public int solve(int[][] arr, int m,int n,int i,int j){
    //     if(i >= m || j >= n)return 0;
    //     if(i == m-1 && j == n-1) return 1;
    //     if(arr[i][j] != -1) return arr[i][j];
    //     return arr[i][j] = solve(arr,m,n,i+1,j) + solve(arr,m,n,i,j+1);
    // }
    public int uniquePaths(int m, int n) {
        // int[][] arr = new int[m][n];
        // for(int[] row: arr){
        //     Arrays.fill(row,-1);
        // }
        // return solve(arr,m,n,0,0);

        int N = m + n - 2;
        int r = m - 1;
        double result = 1;
        for(int i = 1;i<=r;i++){
            result = result * (N-r+i) / i;
        }
        return (int)result;
    }
}
