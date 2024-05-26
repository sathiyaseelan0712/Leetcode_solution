bool isAnagram(char* s, char* t) {
    
    if (strlen(s) != strlen(t)) {
        return false;
    }
    
    int countS[256] = {0};
    int countT[256] = {0};
    
    for (int i = 0; s[i]!='\0' && t[i]!='\0'; i++) {
        countS[s[i]]++;
        countT[t[i]]++;
    }
    
    for (int i = 0; i < 256; i++) {
        if (countS[i] != countT[i]) {
            return false;
        }
    }
    
    return true;
}
    
