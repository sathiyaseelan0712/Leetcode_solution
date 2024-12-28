/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int startIdx(int* nums, int n, int target) {
    int left = 0;
    int right = n - 1, val = -1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            val = mid;
            right = mid - 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return val;
}

int endIdx(int* nums, int n, int target) {
    int left = 0;
    int right = n - 1, val = -1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            val = mid;
            left = mid + 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return val;
}
int* searchRange(int* nums, int n, int target, int* returnSize) {
    int* ans = malloc(sizeof(int)*2);
    *returnSize = 2;
    ans[0] = startIdx(nums,n,target);
    ans[1] = endIdx(nums,n , target);
    return ans;
}

