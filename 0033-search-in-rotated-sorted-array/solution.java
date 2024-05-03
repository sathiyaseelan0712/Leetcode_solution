class Solution {
    public int search(int[] nums, int target) {
        int le=nums.length;
        for(int i=0;i<le;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
