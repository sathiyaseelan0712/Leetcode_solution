bool isPowerOfFour(int n) {
    if(n>0 && ((n&n-1)==0) && ((n-1) == ((((n-1)<<1) & 0xAAAAAAAA) | (((n-1)>>1) & 0x55555555))))
        return true;
    return false;
}
