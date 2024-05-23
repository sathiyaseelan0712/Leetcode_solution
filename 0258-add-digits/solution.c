int addDigits(int n) {
    int sum=0;
    while(n>=10){
        sum=0;
        while(n)
        {
        sum+=(n%10);
        n/=10;
        }
        n=sum;
    }
    return n;
}
