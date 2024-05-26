int strStr(char* a, char* b) {
    int n = strlen(a), m = strlen(b),j,i;
    for (i = 0; i <= n - m; i++) {
        for (j = 0; j < m; j++) {
            if (a[i + j] != b[j]) {
                break;
            }
        }
        if (j == m) 
        {
            return i; 
        }
    }
    return -1;  // Substring not found
}

