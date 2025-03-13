class Solution {
    public int findDelayedArrivalTime(int a, int b) {
        int time = a+b;
        return time%24;
    }
}
