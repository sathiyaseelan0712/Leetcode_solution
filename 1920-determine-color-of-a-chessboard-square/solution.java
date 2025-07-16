class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(1);
        int b = coordinates.charAt(0) - 97;
        return (a + b)  % 2 == 0;
    }
}
