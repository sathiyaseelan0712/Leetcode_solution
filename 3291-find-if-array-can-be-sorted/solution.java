class Solution {
    public boolean canSortArray(int[] nums) {
        int bC = Integer.bitCount(nums[0]);
        int pMax = -1;
        int cMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(Integer.bitCount(nums[i]) != bC){
                bC =Integer.bitCount(nums[i]);
                pMax = Math.max(cMax,pMax);
                cMax = nums[i];
            }
            else{
                cMax = Math.max(cMax,nums[i]);
            }
            if(pMax!= -1 && nums[i] < pMax){
                return false;
            }
        }

        return true;
    }
}
