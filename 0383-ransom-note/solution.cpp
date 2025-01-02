class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<char,int> m;
        for(auto c : magazine){
            m[c] +=1;
        }
        for(auto c:ransomNote){
            m[c] -=1;
            if(m[c] == -1) return false;
        }
        return true;
    }
};
