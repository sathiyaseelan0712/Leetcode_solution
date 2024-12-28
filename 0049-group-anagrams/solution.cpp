class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> m;

        for(auto s : strs){
            string word = s;
            sort(word.begin(),word.end());
            m[word].push_back(s); 
        }

        vector<vector<string>> result;
        for(auto x : m){
            result.push_back(x.second);
        }
        return result;
        
    }
};
