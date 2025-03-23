class Solution {
    public int distanceTraveled(int m, int a) {
        int travel = 0;
        while(m > 0){
            travel++;
            m--;
            if(travel != 0 && travel % 5 == 0 && a-- > 0) m++;
        }
        return travel * 10;
    }
}
