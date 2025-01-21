class Solution {
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n /= 10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int val = sum(x);
        if(x%val == 0) return val;
        return -1;
    }
}
