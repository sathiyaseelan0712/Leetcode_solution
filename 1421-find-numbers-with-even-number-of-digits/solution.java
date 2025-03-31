class Solution {
    private boolean solve(int n){
        int cnt = 0;
        while(n!=0){
            cnt++;
            n /= 10;
        }
        return cnt % 2 == 0 ? true : false;
    }
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int i : nums){
            if(solve(i)) cnt++;
        }
        return cnt;
    }
}
