class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        int n = h.length;
        int left = 0,right = n-1;
        while(left<right){
            int min = Math.min(h[left],h[right]);
            int diff = right - left;
            max = Math.max(max,min*diff);
            if(h[left] < h[right]) left++;
            else right--;
        }
        return max;
    }
}
