class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        int max=h[0];
        left[0]=h[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,h[i]);
            left[i]=max;
        }
        int max1=h[n-1];
        right[n-1]=max1;
        for(int i=n-1;i>=0;i--){
            max1=Math.max(max1,h[i]);
            right[i]=max1;
        }
        int min=0;
        int sum=0;
        for(int i=0;i<n;i++){
            min=Math.min(left[i],right[i]);
            ans[i]=min;
            sum+=ans[i];
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=h[i];
        }
        return sum-sum1;
    }
}
