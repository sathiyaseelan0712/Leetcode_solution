class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public void solve(int[] nums,List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            solve(nums,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        solve(nums, new ArrayList<>());
        return ans;
    }
}
