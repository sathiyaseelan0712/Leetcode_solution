class Solution {
    int cnt = 0;
    int[] di = {1,0,0,-1};
    int[] dj = {0,-1,1,0};
    private void backTrack(int[][] grid,int i,int j,int m,int n,boolean[][] visited,int totalGrid,int cntGrid){
        if(i >= m || j >= n || i < 0 || j < 0 || visited[i][j] == true || grid[i][j] == -1) return;
        // System.out.println(cntGrid + " " + totalGrid + " " +i +" "+j);
        if(grid[i][j] == 2 && totalGrid-1 == cntGrid){
            cnt++;
            return;
        }
        visited[i][j] = true;
        for(int k = 0;k<4;k++){
            int x = i + di[k], y =  j + dj[k];
            backTrack(grid,x,y,m,n,visited,totalGrid,cntGrid+1);
        }
        visited[i][j] = false;
    }
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int start = 0,end = 0;
        int numOfBlock = 0;
        for(int  i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] != -1){
                    numOfBlock++;
                }
                if(grid[i][j] == 1){
                    start = i;
                    end = j;
                }
            }
        }
        backTrack(grid,start,end,m,n,visited,numOfBlock,0);
        return cnt;
    }
}
