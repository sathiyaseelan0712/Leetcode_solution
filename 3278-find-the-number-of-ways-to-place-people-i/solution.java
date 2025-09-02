class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int ax = points[i][0], ay = points[i][1];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int bx = points[j][0], by = points[j][1];
                if (ax > bx || ay < by) continue;
                boolean skip = false;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int cx = points[k][0], cy = points[k][1];
                    
                    if (cx >= ax && cx <= bx && cy <= ay && cy >= by) {
                        skip = true;
                        break;
                    }
                }
                if (!skip) res++;
            }
        }
        
        return res;
    }
}

