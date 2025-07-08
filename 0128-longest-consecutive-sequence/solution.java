class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int cnt = 1;
        int max = 1;
        Arrays.sort(nums);
        int startEle = nums[0];
        for(int i = 1;i<n;i++){
            if(startEle == nums[i]) continue;
            else if(startEle + 1 == nums[i]) cnt++;
            else cnt = 1;

            startEle = nums[i];
            max = Math.max(max,cnt);
        }
        return max;
    }
}
