class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        int ans = 0;
        for(int i = 2;i<n;i++){
            if(prime[i]) ans++;
            for(int j = i+i;j<n;j+=i) prime[j] = false;

        }
        return ans;
    }
}
