int arraySign(int* nums, int numsSize) {
    int nc=0,pc=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==0){
            return 0;
        }
        else if(i[nums]<0){
            nc++;
        }
        else{
            pc++;
        }
    }
    if(nc%2!=0){
        return -1;
    }
    return 1;
}
