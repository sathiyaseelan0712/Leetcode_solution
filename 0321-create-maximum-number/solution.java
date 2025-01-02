class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

    int m = nums1.length, n = nums2.length;
    int[] ans = new int[k];
    
    for (int i = Math.max(0, k-n); i <= Math.min(k, m); i++) {
        int j = k - i;
        int[] maxNum1 = getMax(nums1, i);
        int[] maxNum2 = getMax(nums2, j);
        int[] merged = merge(maxNum1, maxNum2);
        if (compare(merged, 0, ans, 0) > 0) {
            ans = merged;
        }
    }
    return ans;
}
private int[] getMax(int[] nums, int k) {
    int n = nums.length;
    int[] stack = new int[k];
    int top = -1, remaining = n - k;
    
    for (int i = 0; i < n; i++) {
        int num = nums[i];
        while (top >= 0 && stack[top] < num && remaining > 0) {
            top--;
            remaining--;
        }
        if (top < k - 1) {
            stack[++top] = num;
        } else {
            remaining--;
        }
    }
    return stack;
}
private int[] merge(int[] nums1, int[] nums2) {
    int m = nums1.length, n = nums2.length;
    int[] merged = new int[m + n];
    int i = 0, j = 0, k = 0;
    
    while (i < m && j < n) {
        if (compare(nums1, i, nums2, j) > 0) {
            merged[k++] = nums1[i++];
        } else {
            merged[k++] = nums2[j++];
        }
    }
    while (i < m) {
        merged[k++] = nums1[i++];
    }
    while (j < n) {
        merged[k++] = nums2[j++];
    }
    return merged;
}
private int compare(int[] nums1, int i, int[] nums2, int j) {
    int m = nums1.length, n = nums2.length;
    while (i < m && j < n) {
        int diff = nums1[i] - nums2[j];
        if (diff != 0) {
            return diff;
        }
        i++;
        j++;
    }
    return (m - i) - (n - j);
}
}
