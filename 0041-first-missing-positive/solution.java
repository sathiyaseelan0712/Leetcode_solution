class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = 1;
        Arrays.sort(nums);
        for(int i: nums){
            if(i == n){
                n++;
            }
            else if( i > n){
                return n;
            }
        }
        return n;
    }
}
