class Solution {
    public void backTrack(List<List<Integer>> res, List<Integer> cur, int[] nums,int start){
        res.add(new ArrayList<>(cur));
        for(int i = start;i<nums.length;i++){
            cur.add(nums[i]);
            backTrack(res,cur,nums,i+1);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backTrack(res, cur, nums,0);
        return res;
    }
}
