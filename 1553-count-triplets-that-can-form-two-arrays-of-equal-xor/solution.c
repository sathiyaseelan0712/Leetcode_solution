int countTriplets(int* arr, int arrSize) {
   int n=arrSize;
   int res=0;
   for(int i=0;i<n;i++){
    int t=arr[i];
    for(int j=i+1;j<n;j++){
        t=t^arr[j];
        if(t==0)
            res+=(j-i);
    }
   }
   return res;
}
