class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1,right = num;
        while(left<=right){
            long mid = left + ((right - left) >> 1);
            if(mid * mid == num){
                return true;
            }
            if(mid * mid > num){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return false;
    }
}



