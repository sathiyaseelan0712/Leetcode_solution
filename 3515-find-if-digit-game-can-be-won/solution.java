class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOne = 0;
        int sumTwo = 0;
        for(int i : nums){
            if(i/10 == 0){
                sumOne += i;
            }else{
                sumTwo += i;
            }
        }
        return sumOne == sumTwo ? false : true;
    }
}
