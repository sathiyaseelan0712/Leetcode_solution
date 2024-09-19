class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int a=n/2;
       return nums[a];
    }
}
