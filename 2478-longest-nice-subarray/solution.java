class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i = 0, usedBits = 0, maxLen = 0;
        
        for (int j = 0; j < nums.length; j++) {
            while ((usedBits & nums[j]) != 0) {
                usedBits ^= nums[i]; 
                i++; 
            }
            
            usedBits |= nums[j];
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}


