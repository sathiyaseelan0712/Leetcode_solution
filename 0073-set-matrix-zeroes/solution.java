class Solution {
    public void setZeroes(int[][] m) {
        int n = m.length;
        int n2 = m[0].length;
        int[] row = new int[n];
        int[] col = new int[n2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n2;j++){
                if(m[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n2;j++){
                if(row[i] == 1 || col[j] == 1){
                    m[i][j] = 0;
                }
            }
        }

    }
}
