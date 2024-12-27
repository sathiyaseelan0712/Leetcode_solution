int trap(int* h, int n) {
    int left[n];
    int right[n];
    int ans[n];
    int max=h[0],max1=h[n-1];
    for(int i=0;i<n;i++){
        max = fmax(h[i],max);
        left[i] = max;
    }
    for(int i=n-1;i>=0;i--){
        max1 = fmax(h[i],max1);
        right[i]=max1;
    }
    int sum=0;
    for(int i=0;i<n;i++){
        max = fmin(left[i],right[i]);
        ans[i]=max;
        sum+=ans[i];
    }
    int sum1=0;
    for(int i=0;i<n;i++){
        sum1+=h[i];
    }
    printf("%d %d",sum,sum1);
    return sum-sum1;
}
