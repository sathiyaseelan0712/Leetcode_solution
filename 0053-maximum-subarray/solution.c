int maxSubArray(int* a, int n) {
    int cur = a[0];
    int max = a[0];
    for(int i=1;i<n;i++){
        cur = cur + a[i];
        if(cur<a[i]){
            cur =a[i];
        }
        if(max<cur){
            max=cur;
        }
    }
    return max;
}
