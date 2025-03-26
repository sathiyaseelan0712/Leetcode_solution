class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n != 0){
            if((n-(n/3)*3) == 2) return false;
            n /=3;
        }
        return true;
    }
}
