class Solution {
    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public int dayOfYear(String data) {
        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.parseInt(data.substring(0,4));
        int month = Integer.parseInt(data.substring(5,7));
        int day = Integer.parseInt(data.substring(8,10));
        if(isLeapYear(year)){
            dayOfMonth[1] = 29;
        }
        int ans = 0;
        for(int i = 0; i < month -1; i++){
            ans += dayOfMonth[i];
        }
        ans += day;
        return ans;
    }
}
