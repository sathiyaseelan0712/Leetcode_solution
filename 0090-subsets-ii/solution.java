class Solution {
    public void backTrack(int[] nums,int start,List<Integer> cur,List<List<Integer>> res){
        if(!res.contains(cur)){
            res.add(new ArrayList<>(cur));
        }

        for(int i =start;i<nums.length;i++){
            cur.add(nums[i]);
            backTrack(nums,i+1,cur,res);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums,0,new ArrayList<>(),res);
        return res;
    }
}
