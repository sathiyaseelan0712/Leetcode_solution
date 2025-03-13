class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        int x = 0;
        for(int i=n-1;i>=0;i--){
            int y = 0;
            for(int j = 0;j<n;j++){
                mat[j][i] = matrix[x][y++];
            }
            x++;
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = mat[i][j];
            }
        }
    }
}
