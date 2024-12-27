int maxArea(int* h, int n) {
    int maxArea=0;
    int left=0,right=n-1;
    while(left<right){
        int minArea = fmin(h[left],h[right]);
        int curArea = minArea * (right-left);
        maxArea = fmax(curArea,maxArea);
        printf("%d\n",maxArea);
        if(h[left]<h[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return maxArea;
}
