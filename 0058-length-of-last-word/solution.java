class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.length(),count=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' ' && s.charAt(i)!=0){
                return count;
            }
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
