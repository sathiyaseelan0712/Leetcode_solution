class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        vector<int> ans;
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                ans.push_back(nums1[i++]);
            }
            else{
                ans.push_back(nums2[j++]);
            }
        }
        while(i<n) ans.push_back(nums1[i++]);
        while(j<m) ans.push_back(nums2[j++]);
        int total = n+m;
        cout<<"total"<< total;
        if( total%2 == 1){
            return ans[total/2];
        }
        double result = ((double)(ans[total/2]) + (double)(ans[total/2 -1])) / 2.0;
        return result;

        
    }
};
