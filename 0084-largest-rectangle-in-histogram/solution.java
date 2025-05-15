class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftLimit = new int[n];
        int[] rightLimit = new int[n];

        for (int i = 0; i < n; i++) {
            int prev = i - 1;
            while (prev >= 0 && heights[prev] >= heights[i]) {
                prev = leftLimit[prev];
            }
            leftLimit[i] = prev;
        }

        for (int i = n - 1; i >= 0; i--) {
            int next = i + 1;
            while (next < n && heights[next] >= heights[i]) {
                next = rightLimit[next];
            }
            rightLimit[i] = next;
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rightLimit[i] - leftLimit[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
