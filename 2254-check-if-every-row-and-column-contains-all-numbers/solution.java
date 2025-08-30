class Solution {
    private boolean checkRow(int[][] matrix, int val, int row){
        int cnt = 0;
        for(int i = 0;i<matrix.length;i++){
            if(matrix[row][i] == val){
                cnt++;
            }
        }
        return cnt == 1 ? true : false;
    }
    private boolean checkCol(int[][] matrix, int val, int col){
        int cnt = 0;
        for(int i = 0;i<matrix.length;i++){
            if(matrix[i][col] == val){
                cnt++;
            }
        }
        return cnt == 1 ? true : false;
    }
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0;i<n;i++){
            boolean[] seen = new boolean[n+1];
            for(int j= 0;j<n;j++){
                int val = matrix[i][j];
                if(val < 1 || val > n || seen[val]) return false;
                seen[val] = true;
            }
        }

        
        for(int j = 0;j<n;j++){
            boolean[] seen = new boolean[n+1];
            for(int i= 0;i<n;i++){
                int val = matrix[i][j];
                if(val < 1 || val > n || seen[val]) return false;
                seen[val] = true;
            }
        }
        return true;
    }
}
