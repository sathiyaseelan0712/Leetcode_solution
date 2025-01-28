class Solution {
    public static int countOne(String s){
        int len = s.length();
        if(len == 0) return 0;
        if(s.charAt(len-1) == '1'){
            return 1+countOne(s.substring(0,len-1));
        };
        return countOne(s.substring(0,len-1));
    }
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        return countOne(str);
        // return count;
    }
}
