class Solution {
    public boolean check(String a,String b){
        int idx =-1;
        for(char s : b.toCharArray()){
            idx = a.indexOf(s,idx+1);
            if(idx == -1) return false;
        }
        return true;
    }
    public int numMatchingSubseq(String s, String[] words) {
        int count =0;
        for(String a: words){
            if(check(s,a)) count++;
        }
        return count;
    }
}
