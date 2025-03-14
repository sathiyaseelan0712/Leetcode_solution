class Solution {
    public int sum(int[] arr){
        int sum = 0;
        for(int i:arr) sum+=i;
        return sum;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1))/2;
        return total - sum(nums);
    }
}


