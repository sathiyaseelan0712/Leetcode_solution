class Solution {
    public void backTrack(int[] nums, List<List<Integer>> list, List<Integer> tempList){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backTrack(nums,list,tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(nums,list,new ArrayList<>());
        return list;
    }
}
