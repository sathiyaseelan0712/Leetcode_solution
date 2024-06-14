class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int nU=0;
        int toInc=0;
        for(int num:nums)
        {
            nU=Math.max(nU,num);
            toInc+=nU-num;
            nU++;
        }
        return toInc;
    }
}
