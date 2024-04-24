class Solution {
    public void rotate(int[] nums, int k) {
        int le = nums.length;
        int[] arr = new int[le];
        for(int i = 0; i < le; i++) {
            arr[(i + k) % le] = nums[i];
        }
        for(int i = 0; i < le; i++) {
            nums[i] = arr[i];
        }
        for(int i = 0; i < le; i++) {
            System.out.print(nums[i]);
            if (i != le - 1) {
                System.out.print(", ");
            }
        }
    }
}

