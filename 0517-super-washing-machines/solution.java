class Solution {
    private int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public int findMinMoves(int[] m) {
        int total = sum(m);
        int n = m.length;
        if(total%n != 0) return -1;
        int avg = total / n;
        int cnt = 0, res = 0;
       for(int a :m){
            cnt += a-avg;
            res = Math.max(res, Math.max(Math.abs(cnt),a-avg));
       }
        return res;
    }
}
