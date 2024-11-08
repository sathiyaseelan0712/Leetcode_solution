class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[n * 2];
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            nums1[i]=nums[i];
            nums1[i+n]=nums[i];
        }

        for(int i=0;i<n;i++){
            ans[i]=-1;
            for(int j=i+1;j<nums1.length;j++){
                if(nums[i]<nums1[j]){
                    ans[i]=nums1[j];
                    break;
                }
            }
        }
        return ans;
    }
}
