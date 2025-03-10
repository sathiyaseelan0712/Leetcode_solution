class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int max = h[0];
        left[0] = h[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,h[i]);
            left[i] = max;
        }

        int maxR = h[n-1];
        right[n-1] = h[n-1];
        for(int i = n-2;i>=0 ;i--){
           maxR = Math.max(maxR,h[i]);
            right[i] = maxR;
        }

        int[] ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            int min = Math.min(left[i],right[i]);
            ans[i] = min;
            sum += min;
        }

        int sum1 = 0;
        for(int i : h){
            sum1 += i;
        }
        return sum-sum1;
    }
}
