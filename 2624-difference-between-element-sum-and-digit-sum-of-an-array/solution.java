class Solution {
    private int sum(int[] arr){
        int sum = 0;
        int sum2 = 0;
        for(int i: arr) {
            sum += i;
            while(i!=0){
                sum2 += (i%10);
                i /= 10;
            }
        }
        return Math.abs(sum -sum2);
    }

    public int differenceOfSum(int[] nums) {
        return sum(nums);
    }
}
