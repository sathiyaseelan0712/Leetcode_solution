class Solution {
    private int startValue(int[] nums, int a) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int val = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == a) {
                val = mid;
                right = mid - 1;
            } else if (nums[mid] > a) {
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return val;
    }

    private int endValue(int[] nums, int a) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int val = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == a) {
                val = mid;
                // right = mid-1;
                left = mid + 1;
            } else if (nums[mid] > a) {
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return val;
    }

    public int[] searchRange(int[] nums, int target) {
        int startIdx = startValue(nums, target);
        int endIdx = endValue(nums, target);
        int[] ans = new int[2];
        ans[0] = startIdx;
        ans[1] = endIdx;
        return ans;
    }
}
