class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> s;
        unordered_map<int,int> m;
        for(auto ele : nums2){
            while(!s.empty() && ele > s.top()){
                m[s.top()] = ele;
                s.pop();
            }
            s.push(ele);
        }
        while(!s.empty()){
            m[s.top()]=-1;
            s.pop();
        }
        vector<int> ans;
        for(auto ele : nums1){
            ans.push_back(m[ele]);
        }
        return ans;
    }
};
