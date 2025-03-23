class Solution {
    public boolean sum(int n) {
        int sum = 0;
        while(n!=0){
            sum += (n%10);
            n /= 10;
        }
        if((sum & 1) == 0) return true;
        return false;
    }
    public int countEven(int num) {
        int cnt = 0;
        for(int i = 2;i<=num;i++){
            if(sum(i)){
                cnt++;
            }
        }
        return cnt;
    }
}

