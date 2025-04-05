class Solution {
    public int totalMoney(int n) {
        int count = 1;
        int monday = 1;
        int ans = 0;
        for(int i = 1; i<= n;i++){
            ans += count;
            count++;
            // System.out.println(ans);
            if(i%7==0){
                monday += 1;
                count = monday;
            }
        }
        return ans;
    }
}
