class Solution {
    public boolean squareIsWhite(String co) {
        int val = 0;
        val += co.charAt(0) - 'a' + 1;
        val += co.charAt(1) - '0' ;
        if((val&1) == 0) return false;
        return true;
    }
}
