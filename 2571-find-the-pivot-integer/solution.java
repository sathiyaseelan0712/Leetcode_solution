class Solution {
    public int sum(int start,int end){
        int s =0;
        for(int i = start;i<=end;i++) s+=i;
        return s;
    }
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            if(sum(1,i) == sum(i,n)){
                return i;
            }
        }
        return -1;
    }
}
