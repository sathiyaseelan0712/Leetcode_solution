bool isAnagram(char* s, char* t) {
    int m=strlen(s),n=strlen(t);
    if(m!=n) return false;
    int ans[26]={0};
    
    for(int i=0;i<m;i++){
        ans[s[i]-97]++;
        ans[t[i]-97]--;
    }
    for(int i=0;i<26;i++){
        if(ans[i]!=0)   return false;
    }
    return true;
}
