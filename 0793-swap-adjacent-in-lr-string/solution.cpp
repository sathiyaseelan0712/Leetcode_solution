class Solution {
public:
    bool canTransform(string start, string end) {
        string s1="";
        string s2="";
        int i, j, k;
        for(i=0 ; i<start.length() ; i++)
        {
            if(start[i]!='X')
            {
                s1 += start[i];
            }
        }
        for(i=0 ; i<end.length() ; i++)
        {
            if(end[i]!='X')
            {
                s2 += end[i];
            }
        }
        if(s1!=s2)
            return false;      
        for(i=0, j=0 ; i<start.length(), j<end.length();)
        {
            if(start[i]=='X')
            {
                i++;
            }
            else if(end[j]=='X')
            {
                j++;
            }
            else
            {
                if((start[i]=='L' && i<j) || (start[i]=='R' && i>j))
                {
                    return false;
                }
                else
                {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }
};
