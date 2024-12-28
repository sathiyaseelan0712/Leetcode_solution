/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int n, int target, int* returnSize) {
    int left = 0;
    int right = n - 1;
    int* ans = malloc(sizeof(int)*2);
    while (left != right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
            ans[0] = left + 1;
            ans[1] = right + 1;
            break;
        }
        else if(sum < target){
            left++;
        }
        else{
            right--;
        }
    }
    *returnSize = 2;
    return ans;
}
