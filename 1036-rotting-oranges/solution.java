class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> qu = new LinkedList<>();
        int cntFresh = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 2){
                    qu.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
        }
        if(cntFresh == 0) return 0;
        if(qu.isEmpty()) return -1;
        
        int min = -1;
        int[][] direction = { {1,0},{-1,0},{0,1},{0,-1}};
        while(!qu.isEmpty()){
            int size = qu.size();
            for(int i =0;i<size;i++){
                int[] cur = qu.poll();
                int x = cur[0];
                int y = cur[1];
                for(int[] dir : direction){
                    int a = x+dir[0];
                    int b = y+dir[1];
                    if( a >=0 && a <m && b>=0 && b < n && grid[a][b] == 1){
                        cntFresh--;
                        grid[a][b] = 2;
                        qu.offer(new int[] {a,b});
                    }
                }
            }
            min++;
        }
        if(cntFresh == 0) return min;
        return -1;
    }
}
