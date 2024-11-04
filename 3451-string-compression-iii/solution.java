class Solution {
    public String compressedString(String word) {
        int count=1,n=word.length();
        char ch = word.charAt(0);
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<n;i++){
            if(word.charAt(i)==ch&&count<9){
                count++;
            }else{
                ans.append(count).append(ch);
                ch=word.charAt(i);
                count=1;
            }
        }
        ans.append(count).append(ch);
        return ans.toString();
    }
}
