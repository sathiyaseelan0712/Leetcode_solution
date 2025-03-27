class Solution {
    public boolean checkStraightLine(int[][] c) {
       double x = c[1][0] - c[0][0], y = c[1][1] - c[0][1];
       for(int i = 0;i<c.length;i++){
            if(x * (c[i][1]-c[1][1]) != y * (c[i][0] - c[1][0])){
                return false;
            }
       }
        return true;
    }
}
