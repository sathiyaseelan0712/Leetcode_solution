class Solution {
    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int max = nums[0];
        int n = nums.length;
        for(int i = 1;i<n; i++){
            cur += nums[i];
            if(cur < nums[i]) cur = nums[i];
            if(max < cur) max = cur;
        }
        return max;
    }
}
