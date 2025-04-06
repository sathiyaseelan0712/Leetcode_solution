class Solution {
    public String winningPlayer(int x, int y) {
        int p = Math.min(x,y/4);
        return (p % 2 == 1) ? "Alice" : "Bob";
    }
}
