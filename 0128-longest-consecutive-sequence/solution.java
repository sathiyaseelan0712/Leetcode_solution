class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int cnt = 1;
        if( n==0) return 0;
        int max = 1;
        int first = nums[0];
        for(int i=1;i<n;i++){
            if(first == nums[i]) continue;
            else if( first+1 == nums[i]) cnt++;
            else cnt = 1;
            first = nums[i];
            max = Math.max(cnt,max);
        }
        return max;
    } 
}
