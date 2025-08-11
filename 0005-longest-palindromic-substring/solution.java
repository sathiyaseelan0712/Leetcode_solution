class Solution {
    private int start, maxLen;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2) return s;
        for(int i = 0;i<n-1;i++){
            solve(s,i,i);
            solve(s,i,i+1);
        }
        // System.out.println(start + " " + maxLen);
        return s.substring(start, start+maxLen);
    }
    private void solve(String s, int j, int k){
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if(maxLen  < k -j-1){
            start = j+1;
            maxLen  = k-j-1;
        }
    }
}
