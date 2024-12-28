class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()){
            return false;
        }
        unordered_map<char,int> m;
        int n = s.length();
        for(int i = 0; i < n; i++){
            char a = s.at(i);
            char b = t.at(i);
            m[a] = m[a] + 1;
            m[b] = m[b] - 1;
        }
        // for(char c : s){
        //     m[c] +=1;
        // }
        // for(char ch : t){
        //     if(m.count(ch)){
        //         m[ch] -=1;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        for(char a : s){
            if(m[a] != 0){
                return false;
            }
        }
        return true;
    }
};
