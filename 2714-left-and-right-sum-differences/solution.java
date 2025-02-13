class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length,sum=0;
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int rightSum=sum;
        int leftSum=0;
        for(int i=0;i<n;i++){
            rightSum -= nums[i];
            arr[i]=Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return arr;
    }
}
