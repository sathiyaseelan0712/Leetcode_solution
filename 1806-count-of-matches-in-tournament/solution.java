class Solution {
    // public int checkMatch(int n){

    // }
    public int numberOfMatches(int n) {
        int count = 0;
        while(n > 1){
            int div = n/2;
            count += div;
            n = (n%2 == 0) ? n/2 : n/2+1;
        }
        return count;
    }
}
