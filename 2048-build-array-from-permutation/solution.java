class Solution {
    public int[] buildArray(int[] nums) {
        int le=nums.length;
        int[] ans=new int[le];
        for(int i=0;i<le;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
