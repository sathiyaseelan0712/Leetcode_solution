int findMaxConsecutiveOnes(int* nums, int n) {
    int max=0;
    int sum=0;
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            sum=0;
        }
        else{
            sum+=1;
        }
        if(max<sum){
            max=sum;
        }
    }
    return max;
    
}
