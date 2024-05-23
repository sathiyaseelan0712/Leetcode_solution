int* buildArray(int* nums, int numsSize, int* returnSize) {
    int *ans = (int*)malloc(numsSize * sizeof(int));
    if (ans == NULL) {
        // Handle memory allocation failure
        *returnSize = 0;
        return NULL;
    }
    
    for(int i = 0; i < numsSize; i++) {
        ans[i] = nums[nums[i]];
    }
    
    *returnSize = numsSize;
    return ans;
}
