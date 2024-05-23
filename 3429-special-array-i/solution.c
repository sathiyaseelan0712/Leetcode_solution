bool isArraySpecial(int* nums, int numsSize) {
    if(numsSize==1)
    {
        return 1;
    }
    for(int i=0;i<numsSize-1;i++)
    {
        if((nums[i]&1)==(nums[i+1]&1))
        {
            return 0;
        }
    }
    return 1;
}
