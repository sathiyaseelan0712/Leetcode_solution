public class Solution {
    public boolean canTransform(String start, String end) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != 'X') {
                s1.append(start.charAt(i));
            }
        }
        
        for (int i = 0; i < end.length(); i++) {
            if (end.charAt(i) != 'X') {
                s2.append(end.charAt(i));
            }
        }
        
        if (!s1.toString().equals(s2.toString())) {
            return false;
        }
        
        for (int i = 0, j = 0; i < start.length() && j < end.length();) {
            if (start.charAt(i) == 'X') {
                i++;
            } else if (end.charAt(j) == 'X') {
                j++;
            } else {
                if ((start.charAt(i) == 'L' && i < j) || (start.charAt(i) == 'R' && i > j)) {
                    return false;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }
}

