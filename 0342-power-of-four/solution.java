class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<=15;i++){
            int val = (int) Math.pow(4,i);
            if(val == n) return true;
            if(val > n) return false;
        }
        return false;
    }
}
