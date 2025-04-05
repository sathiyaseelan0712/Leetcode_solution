class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int n = s.length();
        for(int i = 0;i <n;i++){
            int c = s.charAt(i) - 'A' + 1;
            res = res * 26 + c;
        }
        return res;
    }
}
