class Solution {
    public int minSteps(int n) {
        if(n==1){
            return 0;
        }
        int ans=0;
        int p=1;
        int count=0;
        while(p!=n){
            if(n%p==0){
                count=p;
                ans++;
            }
            p+=count;
            ans++;
        }
        return ans;
       
    }
}
