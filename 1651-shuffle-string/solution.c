char* restoreString(char* s, int* in, int iS) {
    char* arr = malloc(sizeof(char) * iS+1);
    for(int i=0;i<iS;i++){
        arr[in[i]] = s[i];
    }
    arr[iS] = '\0';
    return arr;
}
