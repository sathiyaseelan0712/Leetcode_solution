class Solution {
    public int sum(int n){
        int sum = 0;
        while( n != 0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a = sum(x);
        if(x%a == 0) return a;
        return -1;
    }
}
