class Solution {
    public void backTrack(int start, List<Integer> cur, List<List<Integer>> res, int[] can, int target){
        if(target < 0) return;
        if(target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = start;i<can.length;i++){
            if(i>start && can[i] == can[i-1]) continue;
            cur.add(can[i]);
            backTrack(i+1, cur, res, can, target-can[i]);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(can);
        backTrack(0,cur,res,can,target);
        return res;
    }
}
