class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = 0;
        int junk = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            max = Math.max(max,arr[i]);
            if(max == i) junk++;
        }
        return junk;
    }
}
