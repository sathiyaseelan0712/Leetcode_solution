class Solution {
    public int countDigit(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }

    public boolean check(int n) {
        int total = countDigit(n);
        if(total % 2 != 0) return false;
        int firstHalf = total / 2;
        int lasthalf = total - firstHalf;
        int fs = 0, ls = 0;
        while (lasthalf != 0) {
            int rem = n % 10;
            ls += rem;
            n /= 10;
            lasthalf -= 1;
        }
        while (firstHalf != 0) {
            int rem = n % 10;
            fs += rem;
            n /= 10;
            firstHalf -= 1;
        }
        if (ls == fs)
            return true;
        else
            return false;
    }

    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for (int i = low; i <= high; i++) {
            if (check(i))
                cnt++;
        }
        return cnt;
    }
}
