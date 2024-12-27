class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int max=0,min=INT_MAX,curPro=0;
        for(int sellIdx=0;sellIdx<n;sellIdx++){
            min = fmin(prices[sellIdx],min);
       
            curPro = prices[sellIdx] - min;
            cout<<min<<" "<<curPro;

            max = fmax(max,curPro);
            cout<<max;
        }
        return max;
    }
};
