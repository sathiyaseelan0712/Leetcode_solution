class Solution {
    public boolean isUgly(int n) {
        return n<=0 ? false : (n%3==0 ? isUgly(n/3):(n%5==0 ? isUgly(n/5):((n&(n-1))==0)));
    }
}
