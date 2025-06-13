class Solution {
    public void backTrack(List<Integer> cur,List<List<Integer>> res, int[] nums){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
        }
        for(int i = 0;i<nums.length;i++){
            if(cur.contains(nums[i]))continue;
            cur.add(nums[i]);
            backTrack(cur,res,nums);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        backTrack(cur, res, nums);

        return res;
    }
}
