class Solution {
    private List<String> ans;
    private void backTrack(String s, int open, int close, int max){
        if(!ans.contains(s) && s.length() == max *2){
            ans.add(s);
            return;
        }
        if(open < max) backTrack(s+"(", open+1,close,max);
        if(close < open) backTrack(s+")", open,close+1,max);
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        backTrack("",0,0,n);
        return ans;
    }
}
