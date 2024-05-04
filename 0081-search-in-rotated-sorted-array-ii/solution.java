class Solution {
    public boolean search(int[] nums, int target) {
        int le=nums.length;
        for(int i=0;i<le;i++)
        {
            if(nums[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
