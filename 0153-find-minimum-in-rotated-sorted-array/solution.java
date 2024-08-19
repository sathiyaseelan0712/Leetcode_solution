class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}
