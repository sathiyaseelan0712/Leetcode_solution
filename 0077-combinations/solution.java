class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private void solve(int start, int n, int k,List<Integer> list){
        // System.out.println(list.toString());
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start;i<=n;i++){
            list.add(i);
            solve(i+1, n, k, list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        solve(1, n, k, list);
        return ans;
    }
}
