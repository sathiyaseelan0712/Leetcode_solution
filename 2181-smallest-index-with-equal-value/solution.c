int smallestEqual(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++){
        if(i%10==nums[i]){
            return i;
            break;
        }
    }
    return -1;
}
