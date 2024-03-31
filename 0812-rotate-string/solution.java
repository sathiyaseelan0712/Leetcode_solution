class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        String a=s+s;
        int index=a.indexOf(goal);
        if(index>=0)
        return true;
        else
        return false;
    }
}
