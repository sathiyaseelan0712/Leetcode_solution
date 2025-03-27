class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int ope = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=k;i++) 
            ans.add(i);
        int n = nums.size();
        for(int i=n-1;i>=0;i--){
            if(ans.contains(nums.get(i))){
                ans.remove(nums.get(i));
            }
            ope++;
            if(ans.size() == 0) break;
        }
        return ope;
    }
}
