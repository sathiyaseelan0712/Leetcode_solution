class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a;
        for(int i=0;i<n-2;i+=2){
            if((nums[i]==nums[i+1])){
                continue;
            }
            else{
                return nums[i];
            }
        }
        return nums[n-1];

    }
}
