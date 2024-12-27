class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        unordered_map<int,int> m;
        int count=0;
        for(auto ele : nums){
            count+=m[ele];
            m[ele] +=1;
        }
        return count;
    }
};
