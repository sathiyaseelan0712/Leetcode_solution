class Solution {
    public void backTrack(int start, List<Integer> cur,List<List<Integer>> res,int n,int target,int k){
        if(target<0) return;
        if(target == 0 && cur.size() == k){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = start;i<9;i++){
            cur.add(i+1);
            backTrack(i+1,cur,res,n,target-(i+1),k);
            cur.remove(cur.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        backTrack(0,cur,res,n,n,k);
        return res;
    }
}
