class Solution {
    public int maxArea(int[] height) {
        int areaMax = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int length = Math.min(height[left],height[right]);
            int width = right - left;
            areaMax = Math.max(areaMax,length*width);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return areaMax;
    }
}
