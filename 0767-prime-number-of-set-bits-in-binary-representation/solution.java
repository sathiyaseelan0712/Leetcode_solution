class Solution {
    public int setBits(int n){
        return Integer.bitCount(n);
    }
    public boolean checkPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for(int i=left;i<=right;i++){
            int val = setBits(i);
            if(checkPrime(val)) cnt++;
        }
        return cnt;
    }
}
