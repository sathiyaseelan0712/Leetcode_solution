class Solution {
    public boolean isPerfectSquare(int num) {
       if(num<1){
        return false;
       }
       if(num==1){
        return true;
       }
       long left=1,right=num;
       while(left<=right){
        long mid= left+(right-left)/2;
        long sum=mid*mid;
        if(sum<num){

            left=mid+1;
        }
        else if(sum>num){
            right=mid-1;
        }
        else{
            return true;
        }
       }
       return false;
    }
}
