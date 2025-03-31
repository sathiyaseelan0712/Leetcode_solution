class Solution {
    public long interchangeableRectangles(int[][] rect) {
        long cnt = 0;
        int n = rect.length;
        Map<Double,Integer> m = new HashMap<>();
        for(int[] i : rect){
            double ratio = (double) i[0] / i[1];
            cnt += m.getOrDefault(ratio,0);
            m.put(ratio,m.getOrDefault(ratio,0)+1);
        }
        return cnt;
    }
}
