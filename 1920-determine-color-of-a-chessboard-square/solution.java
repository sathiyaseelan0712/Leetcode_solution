class Solution {
    public boolean squareIsWhite(String c) {
        int sum = 0;
        for(int i: c.toCharArray()){
            sum += i;
        }
        if(sum%2==0) return false;
        return true;
    }
}
