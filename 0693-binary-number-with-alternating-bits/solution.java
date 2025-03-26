class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n&1;
        n = n >> 1;
        while(n!=0){
            int cur = n & 1;
            if(cur == prev) return false;
            prev = cur;
            n = n >> 1;
        }
        return true;
    }
}
