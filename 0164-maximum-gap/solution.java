class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i+1]-nums[i];
            if(a>diff){
                diff=a;
            }
        }
        return diff;
    }
}
