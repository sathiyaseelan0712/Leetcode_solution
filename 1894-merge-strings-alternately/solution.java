class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder ans=new StringBuilder();
        int a=0,b=0;
        while(a<n||b<m){
            if(a<n)
            {
                ans.append(word1.charAt(a));
                a++;
            }
            if(b<m){
                ans.append(word2.charAt(b));
                b++;
            }
        }
        return ans.toString();
    }
}
