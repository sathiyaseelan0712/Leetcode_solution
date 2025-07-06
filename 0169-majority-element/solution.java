class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0) {
                ele = nums[i];
                cnt = 1;
            } else if (ele == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int eleCnt = 0;
        for (int i : nums) {
            if (i == ele) {
                eleCnt++;
            }
        }
        return eleCnt > nums.length / 2 ? ele : -1;
    }
}
