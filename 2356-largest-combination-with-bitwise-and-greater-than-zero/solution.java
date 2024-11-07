class Solution {
    public int largestCombination(int[] ca) {
        int max_freq=0;
        for(int i=0;i<32;i++){
            int freq=0;
            for(int ele : ca){
                if((ele&(1<<i)) != 0){
                    freq++;
                }
            }
            if(freq>max_freq){
                max_freq=freq;
            }
        }
        return max_freq;
    }
}
