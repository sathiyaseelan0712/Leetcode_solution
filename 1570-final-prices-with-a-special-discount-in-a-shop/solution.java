class Solution {
    public int[] finalPrices(int[] p) {
        int n=p.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(p[i]>=p[j]){
                    p[i]-=p[j];
                    break;
                }
            }
        }
        return p;
    }
}
