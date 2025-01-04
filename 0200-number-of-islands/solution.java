class Solution {
    private int m,n;
    public int numIslands(char[][] grid) {
        int count =0;
        n = grid.length;
        if(n == 0) return 0;
        m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    trav(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    private void trav(int i,int j, char[][] grid){
        if( i<0 || j<0 || i>= n || j>=m || grid[i][j] == '0') return;
        grid[i][j] = '0';
        trav(i-1,j,grid);
        trav(i,j-1,grid);
        trav(i+1,j,grid);
        trav(i,j+1,grid);
    }
}
