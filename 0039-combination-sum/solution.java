class Solution {
    public void backTrack(int start,List<Integer> cur,List<List<Integer>> res, int[] candidates, int target){
        if(target < 0) return;
        if(target == 0) {
            res.add(new ArrayList(cur));
            return;
        }
        for(int i = start; i<candidates.length;i++){
            cur.add(candidates[i]);
            backTrack(i,cur,res,candidates,target-candidates[i]);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backTrack(0,cur,res, candidates, target);
        return res;
    }
}
