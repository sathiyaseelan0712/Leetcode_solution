class Solution {
    public int[] sort(int[] arr){
        int n  = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 1;j<n-i;j++){
                if(arr[j-1] < arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> m = new HashMap<>();
        int n = heights.length;
        for(int i = 0 ;i<n;i++){
            m.put(heights[i],names[i]);
        }
        heights = sort(heights);
        String[] ans = new String[n];
        for(int i = 0;i<n;i++){
            ans[i] = m.get(heights[i]);
        }
        return ans;
    }
}
