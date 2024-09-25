int minimumSum(int num) {
    int num1,num2;
    num1=num/100;
    num2=num%100;
    int a,b,x,y;
    a=num1/10;
    b=num1%10;
    x=num2/10;
    y=num2%10;
    int arr[4]={a,b,x,y};
    for(int i=0;i<4-1;i++){
        for(int j=i+1;j<4;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<4;i++){
        printf("%d ",arr[i]);
    }
    int nums1=arr[0]*10+arr[3];
    int nums2=arr[1]*10+arr[2];
    int ans=nums1+nums2;
    return ans;
}
