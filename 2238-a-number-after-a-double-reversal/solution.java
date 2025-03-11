class Solution {
    public int reverseNumber(int n){
        int rev = 0;
        while(n!=0){
            int rem = n %10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int rev = reverseNumber(num);
        int again = reverseNumber(rev);
        if(again == num){
            return true;
        }
        return false;
    }
}
