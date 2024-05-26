char* intToRoman(int num) {
    char* sym[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char* res = (char*)malloc(20 * sizeof(char));
    int ind = 0, resInd = 0;
    while (num > 0) {
        if (num >= val[ind]) {
            strcpy(res+resInd, sym[ind]);
            resInd += strlen(sym[ind]);
            num -= val[ind];
        } else {
            ind++;
        }
    }
    res[resInd] = '\0';
    return res;
}
