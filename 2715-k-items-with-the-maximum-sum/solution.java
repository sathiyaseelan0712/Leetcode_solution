class Solution {
    public int kItemsWithMaximumSum(int o, int z, int nO, int k) {
        int sum = 0;
        while(k!=0){
            if(o > 0){
                sum+=1;
                o--;
            }else if(z > 0){
                sum+=0;
                z--;
            }
            else{
                sum-=1;
                nO--;
            }
            k--;
        }
        return sum;
    }
}
