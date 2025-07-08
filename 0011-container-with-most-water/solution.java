class Solution {
    public int maxArea(int[] h) {
        int area = 0;
        int n = h.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int height = Math.min(h[left],h[right]);
            int width = right - left;
            area = Math.max(area,height*width);
            if(h[left] < h[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
