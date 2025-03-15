class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;++i){
            Set<Integer> ans = new HashSet<>();
            int cur = i;
            int sign = nums[i] > 0 ? 1: -1;
            int count = 0;
            while(!ans.contains(cur) && (nums[cur] * sign > 0)){
                ans.add(cur);
                cur = ((cur+nums[cur]) % len + len)%len;
                count++;
                if(cur == i && count>1) return true;
            }
        }
        return false;
    }
}
