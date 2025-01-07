class Solution {
    public int myAtoi(String s) {
        String string = s.trim();
        if (string.isEmpty())
            return 0;

        int i = 0;
        boolean isNeg = false;

        if (string.charAt(i) == '-') {
            isNeg = true;
            i++;
        } else if (string.charAt(i) == '+')
            i++;

        int result = 0;
        while (i < string.length()) {
            char c = string.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            int digit = c - '0';

            if (result > Integer.MAX_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            result = result * 10 + digit;
            i++;
        }
        return isNeg ? -result : result;
    }
}
