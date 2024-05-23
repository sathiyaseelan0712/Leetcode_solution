bool isPalindrome(int x) {
    long rev=0,rem=0,n=x;
    while(n>0)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        n/=10;
    }
    if(x==rev)
    return 1;
    else
    return 0;
}
