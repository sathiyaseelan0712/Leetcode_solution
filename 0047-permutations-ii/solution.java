class Solution {
    public void backTrack(int[] nums, List<List<Integer>> list, List<Integer> temp, boolean[] used){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            temp.add(nums[i]);
            used[i] = true;
            backTrack(nums,list,temp,used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTrack(nums,list, new ArrayList<>(),used);
        return list;
    }
}
