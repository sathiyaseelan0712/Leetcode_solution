class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1){
                    result += 4;
                    if(i < m-1 && grid[i+1][j] == 1) result -=2;
                    if(j < n-1 && grid[i][j+1] == 1) result -=2;
                }
            }
        }
        return result;
    }
}
