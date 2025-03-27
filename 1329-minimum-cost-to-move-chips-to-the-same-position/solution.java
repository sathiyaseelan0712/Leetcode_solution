class Solution {
    public int minCostToMoveChips(int[] p) {
        int cnt1 = 0,cnt2 = 0;
        for(int i = 0;i<p.length;i++){
            if(p[i] % 2 == 0) cnt1++;
            else cnt2++;
        }
        return Math.min(cnt1,cnt2);
    }
}
