int missingNumber(int* nums, int n) {
    int sum=0;
    for(int i=0;i<=n;i++){
        sum+=i;
    }
    int sum1=0;
    for(int i=0;i<n;i++){
        sum1+=nums[i];
    }
    return sum-sum1;
}
