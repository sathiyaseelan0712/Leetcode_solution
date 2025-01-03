class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean neg = num < 0 ? true :false;
        num = Math.abs(num);
        StringBuilder ans = new StringBuilder();
        while(num!=0){
            int mod = num % 7;
            ans.append((mod));
            num /= 7;
        }
        if(neg) ans.append("-");
        ans.reverse();
        return ans.toString();
    }
}
