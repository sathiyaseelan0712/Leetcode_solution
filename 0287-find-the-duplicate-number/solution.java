class Solution {
    public int findDuplicate(int[] nums) {
        // Solution 1 tc-o(nlogn) sc- o(1)
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return 0;

        // Solution 2 tc-o(n), sc- o(n);
        // Set<Integer> set = new HashSet<>();
        // for(int i :nums){
        //     if(!set.add(i)){
        //         return i;
        //     }
        // }
        // return 0;

        // solution 3 tc - o(n), sc - o(1)
        for(int  i = 0;i<nums.length;i++){
            int idx = Math.abs(nums[i]);
            if(nums[idx] < 0){
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return 0;
    }
}
