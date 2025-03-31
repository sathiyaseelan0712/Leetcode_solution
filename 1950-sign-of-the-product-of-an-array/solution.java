class Solution {
    public int arraySign(int[] nums) {
        int n = 0, p = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0)
                return 0;
            else if (nums[i] < 0)
                n++;
            else
                p++;
        }
        if (n % 2 != 0)
            return -1;
        return 1;
    }
}
