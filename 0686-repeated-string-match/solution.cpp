class Solution {
public:
    vector<int> ZAlgorithm(string s) {
        int n = s.size();
        vector<int> z(n, 0);
        int l = 0, r = 0;
        for (int i = 1; i < n; ++i) {
            if (i <= r) {
                z[i] = min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < n && s[z[i]] == s[i + z[i]]) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        return z;
    }
    int repeatedStringMatch(string a, string b) {
        string temp = a;
        int q = ceil(double(b.size()) / double(a.size()));
        for (int i = 1; i < q; ++i)
            temp += a;
        string combined = b + "$" + temp;  
        vector<int> z = ZAlgorithm(combined);
        for (int i = 0; i < z.size(); ++i) {
            if (z[i] == b.size()) {
                int start = i - (b.size() + 1); 
                return (start + b.size()) / a.size() + ((start + b.size()) % a.size() == 0 ? 0 : 1);
            }
        }
        temp += a;
        combined = b + "$" + temp;
        z = ZAlgorithm(combined);
        for (int i = 0; i < z.size(); ++i) {
            if (z[i] == b.size()) {
                int start = i - (b.size() + 1);
                return (start + b.size()) / a.size() + ((start + b.size()) % a.size() == 0 ? 0 : 1);
            }
        }
        return -1;
    }
};
