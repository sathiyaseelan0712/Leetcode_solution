class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        int n = c.length;
        List<Boolean> ans = new ArrayList<>(n);
        int max = c[0];
        for(int i=1;i<n;i++){
            if(max<c[i]){
                max=c[i];
            }
        }
        for(int i=0;i<n;i++){
            int a = c[i]+ec;
            if(a>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}
