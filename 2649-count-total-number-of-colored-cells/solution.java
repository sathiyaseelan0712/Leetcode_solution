class Solution {
    public long coloredCells(int n) {
        long sum = 1;
        for(long i=1;i<n;i++){
            sum = sum + (4*i);
        }
        return sum;
    }
}

