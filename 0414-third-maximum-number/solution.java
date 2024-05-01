import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int Count = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                Count++;
            }
            if (Count == 3) {
                return nums[i];
            }
        }
        return nums[len-1];
    }
}
