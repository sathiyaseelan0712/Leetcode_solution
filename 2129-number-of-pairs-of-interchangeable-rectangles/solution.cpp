class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rect) {
        long long pc =0;
        unordered_map<double,int> m;
        for(auto ele:rect){
            double ratio  = (double) ele[0] / ele[1];
            pc += m[ratio];
            m[ratio] += 1;
            cout<<m[ratio]<<" "<<pc<<"\n";
        }
        
        return pc;
    }
};
