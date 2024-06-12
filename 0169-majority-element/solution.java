class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(c==0)
            {
                a=nums[i];
                c=1;
            }
            else if(nums[i]==a)
            {
                c++;
            }
            else{
                c--;
            }
        }
        return a;
    }
}
