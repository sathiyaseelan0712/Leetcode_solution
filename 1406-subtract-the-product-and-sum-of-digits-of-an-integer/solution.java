class Solution {
    public int sum(int x){
        int sum = 0;
        int mul = 1;
        while(x != 0){
            int rem = x %10;
            sum += rem;
            mul *= rem;
            x /= 10;
        }
        return mul-sum;
    }
    public int subtractProductAndSum(int n) {
        return sum(n);
    }
}
