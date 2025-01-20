class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char[] a = s.toCharArray();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == '(') {
                cnt++;
                sb.append('(');
            } else {
                if (cnt == 0) {
                    i++;
                } else {
                    sb.append(')');
                    cnt--;
                }
            }
        }
        return sb.toString();
    }
}
