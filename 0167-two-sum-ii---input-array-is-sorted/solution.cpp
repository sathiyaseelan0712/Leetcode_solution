class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int t) {
        int n = nums.size();
        int left =0 ,right =n-1;
        vector<int> ans;
        while(left!=right){
            int a =nums[left]+nums[right];
            if(a == t){
                ans.push_back(left+1);
                ans.push_back(right+1);
                break;
            }
            else if(a<t){
                left ++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
};
