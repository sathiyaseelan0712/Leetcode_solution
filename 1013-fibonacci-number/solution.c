int fib(int n){
    int a=0;
    int b=1;
    int c=0;
    int sum;
    if(n==1)
    return 1;
    else if (n==2)
    return 1;
    while(n>=2)
    {
        c=a+b;
        a=b;
        b=c;
        n--;
    }
    return c;
}
