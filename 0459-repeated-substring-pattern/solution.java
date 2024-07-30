class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dou=s+s;
        String sub=dou.substring(1,dou.length()-1);
        return sub.contains(s);
    }
}
