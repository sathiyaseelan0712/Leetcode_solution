class Solution {
    private int sum(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum += i;
        }
        return sum;
    }
    public int arraySum(int[] arr,int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    } 
    public int missingNumber(int[] nums) {
        return sum(nums.length) - arraySum(nums,nums.length);
    }
}
