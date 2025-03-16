class Solution {
    private static int max = 1_000_000_007;

    public static int countPrimes(int n){
        int count = 0;
        for(int i = 2;i<=n;i++){
            int flag = 0;
            for(int j = 2; j<=i/2;j++){
                if(i%j == 0) {
                    flag = 1;
                }
            }
            if(flag == 0)count++;
        }
        return count;
    }

     public static int fact(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = (int)((long) result * i % max);  
        }
        return result;
    }

    public int numPrimeArrangements(int n) {
        int primeCount = countPrimes(n);
        int nonPrimeCount = n - primeCount; 
        return (int) ((long) fact(primeCount) * fact(nonPrimeCount) % max);
    }
}
