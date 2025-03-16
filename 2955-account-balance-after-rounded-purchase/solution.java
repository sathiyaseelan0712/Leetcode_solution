class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int rem = p%10;
        int f = 0;
        if(rem >= 5) f = p+(10-rem);
        else f = p-rem;
        return 100-f;
    }
}
