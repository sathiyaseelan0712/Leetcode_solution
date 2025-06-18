class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        for(int i = 0;i<k;i++){
            res += nums[i];
        }
        int cur_sum = res;
        for(int i = k;i<n;i++){
            cur_sum += nums[i] - nums[i-k];
            res = Math.max(cur_sum,res);
        }
        return res*1.0/k;
    }
}
