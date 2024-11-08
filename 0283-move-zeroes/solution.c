void moveZeroes(int* nums, int n) {
    int l=0;
    for(int r=0;r<n;r++){
        if(nums[r]!=0){
            int temp = nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            ++l;
        }
    }
}
