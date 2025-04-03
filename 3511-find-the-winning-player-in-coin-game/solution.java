class Solution {
    public String winningPlayer(int x, int y) {
        int player = Math.min(x,y/4);
        return (player %2 != 1) ? "Bob" : "Alice";
    }
}
