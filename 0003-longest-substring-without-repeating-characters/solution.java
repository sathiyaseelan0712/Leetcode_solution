class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        Set<Character> set = new HashSet<>();
        int size = 0;
        int left = 0;
        int right = 0;
        for(char a : s.toCharArray()){
            while(set.contains(a)){
                set.remove(s.charAt(left++));
            }
            set.add(a);
            right++;
            size = Math.max(size, right - left);
        }
        return size;
    }
}
