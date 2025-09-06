class Solution {
    private long get(long n){
        if(n == 0) return 0;
        long res = 0, base =1, step =1;
        while(base <= n){
            long cnt = Math.min(n, base * 4 -1) - base +1;
            res += cnt *step;
            base *= 4;
            step++;
        }
        return res;

    }
    public long minOperations(int[][] queries) {
        long res = 0;
        for(int[] q : queries){
            long l = q[0] , r= q[1];
            long total = get(r) - get(l-1);
            res += ( total + 1 ) / 2;
        }
        return res;
    }
}
