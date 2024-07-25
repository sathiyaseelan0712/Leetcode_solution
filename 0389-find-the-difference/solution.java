class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length(),m=t.length(),flag=1;
        if(n==0)
            return t.charAt(0);
        int sum=0;
        for(int i=0;i<m;i++){
            sum=sum+t.charAt(i);
        }
        for(int j=0;j<n;j++){
            sum-=s.charAt(j);
        }
        return (char)sum;
    }
}
