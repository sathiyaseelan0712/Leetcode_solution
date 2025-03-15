class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<=15;i++){
            int ans = (int) Math.pow(4,i);
            if(n == ans) return true;
            if(ans > n) return false;
        }
        return false;
    }
}
