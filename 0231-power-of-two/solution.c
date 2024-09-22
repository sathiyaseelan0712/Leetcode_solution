bool isPowerOfTwo(int n) {
    if(n==1)
        return true;
    if(n<=0)
        return false;
    int a=n,count=0;
    while(a>1){
        if(a%2!=0)
            return false;
        a=a/2;
        count+=1;
        printf("%d %d\n",a,count);
    }
    int x=1;
    for(int i=0;i<count;i++){
        x*=2;
    }
    if(x==n){
        return true;
    }
    return false;
}
