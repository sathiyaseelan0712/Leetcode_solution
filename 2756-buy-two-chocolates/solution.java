class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int num=money;
        for(int i=0;i<2;i++){
            num-=prices[i];
        }
        if(num<0){
            return money;
        }
        return num;
    }
}
