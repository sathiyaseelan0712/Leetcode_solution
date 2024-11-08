class Solution {
    public int[] getMaximumXor(int[] nums, int mB) {
        int a = (int)Math.pow(2,mB) -1;
        int n=nums.length;
        int[] ans =new int[n];
        int xV=0;
        for(int i=0;i<n;i++){
            xV^=nums[i];
        }
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++] = xV ^ a;
            xV ^= nums[i];
        }
        return ans;
    }
}
