int reverse(int x){
    long rev=0;
    while(x!=0){
        int rem=x%10;
        int sum = rev*10+rem;
        if((sum-rem)/10!=rev){
            return 0;
        }
        rev = sum;
        x=x/10;
    }
    return rev;
}
