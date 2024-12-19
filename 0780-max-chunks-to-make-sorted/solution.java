class Solution {
    public int maxChunksToSorted(int[] arr) {
        int m=-1;
        int count =0;
        for(int i=0;i<arr.length;i++){
            m = Math.max(m,arr[i]);
            if(m==i){
                count++;
            }
        }
        return count;
    }
}
