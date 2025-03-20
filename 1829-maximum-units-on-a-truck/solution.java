class Solution {
    public int maximumUnits(int[][] boxTypes, int k) {
        int ans = 0;
        int n = boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            int value = 0;
            for(int j=0;j<2;j++){
                if(k == 0){
                    break;
                }
                if(boxTypes[i][j] <= k){
                    value = boxTypes[i][j++] * boxTypes[i][j];
                     k -= boxTypes[i][0];
                }
                else {
                    int val = boxTypes[i][j++] - k;
                    value = k * boxTypes[i][j];
                    k=0;
                }
            }
            ans += value;
        }
        return ans;
    }
}
