class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int cntFresh = 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
        }
        if(cntFresh == 0) return 0;
        if(queue.isEmpty()) return -1;
        
        int[][] dir = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };

        int ans = -1;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size != 0){
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                for(int i = 0;i<4;i++){
                    int x1 = x + dir[i][0];
                    int y1 = y + dir[i][1];
                    if(x1 >= 0 && x1 < m && y1 >= 0 && y1 < n && grid[x1][y1] == 1){
                        cntFresh--;
                        grid[x1][y1] = 2;
                        queue.add(new int[]{x1,y1});
                    }
                }  
                size--;              
            }
            ans++;
 
        }
        if(cntFresh == 0) return ans;
        return -1;
    }
}
