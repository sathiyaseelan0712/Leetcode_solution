class Solution {
    private boolean checkTrue(List<Boolean> arr, int n){
        for(int i=0;i<n;i++){
            if(arr.get(i) != true) return false;
        }
        return true;
    }
    public int numTimesAllBlue(int[] f) {
        int n = f.length;
        List<Boolean> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(false);
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            arr.set(f[i - 1] - 1, true);
            if(checkTrue(arr,i)){
                cnt++;
            }
        }
        return cnt;

    }
}
