class Solution {
    public String largestOddNumber(String num) {
        int n = num.length() - 1;
        while(n >= 0){
            char c = num.charAt(n);
            while((c - '0') % 2 != 0){
                return num.substring(0,n+1);
            }
            n--;
        }
        return  "";
    }
}
