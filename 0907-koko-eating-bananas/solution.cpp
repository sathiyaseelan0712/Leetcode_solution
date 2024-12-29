class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int left = 1, right = 1e9;
        while(left<right){
            int mid = (left+right)/2;
            int totSum = 0;
            for(int pile : piles){
                totSum += (pile / mid) + (pile % mid != 0);
                if(totSum > h) break;
            }
            if(totSum <= h)
            {
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
};
