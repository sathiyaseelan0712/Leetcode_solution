import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] result = new int[2];
        int idx = 0;

        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                result[idx++] = nums[i];
                if (idx == 2) {
                    break;
                }
            } else {
                i++;
            }
        }

        return result;
    }
}

