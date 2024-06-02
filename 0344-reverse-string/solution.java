class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int left=0,rigth=n-1;
        while(left<rigth){
            char temp=s[left];
            s[left]=s[rigth];
            s[rigth]=temp;
            left++;
            rigth--;
        }
    }
}
