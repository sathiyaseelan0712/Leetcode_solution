class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int a=nums.size();
        int ans=a*(a+1)/2;
        for(int i=0;i<nums.size();i++){
            ans-=nums[i];
        }
        return ans;
    }
};
