class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int) Math.sqrt(c);
        while(start <= end){
            long val = (long)Math.pow(start,2) + (long)Math.pow(end,2);
            if(val == c) return true;
            if(val > c) end--;
            else start++;
        }
        return false;
    }
}


