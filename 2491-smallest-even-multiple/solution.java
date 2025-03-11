class Solution {
    public boolean isDiv(int n){
        return n%2 == 0;
    }
    public int smallestEvenMultiple(int n) {
        return isDiv(n) ? n : n*2;
    }
}
