class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int one = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                one++;
            else
                zero++;
        }
        for (int i = 0; i < one - 1; i++)
            str.append('1');
        for (int i = 0; i < zero; i++)
            str.append('0');
        str.append('1');
        return str.toString();
    }
}
