class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        int n = bloomDay.size();
        // if ((m * k) > n) {
        //     return -1;
        // }
        int minday = -1;
        int left = 1, right = 1e9;
        while (left <= right) {
            int mid = (left+right) / 2; 
            int bc = 0, nofb = 0;
            for (int j = 0; j < n; j++) {
                if (bloomDay[j] <= mid) {
                    ++bc;
                } else {
                    bc = 0;
                }
                if (bc == k) {
                    nofb++;
                    bc = 0;
                }
            }
            if (nofb >= m) {
                minday = mid;
                right = mid -1;
            }
            else{
                left =mid+1;
            }
        }
        return minday;
    }
};
