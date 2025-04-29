class Solution {
    private int[][] map;

    private int lcs(String s1, String s2, int i, int j) {
        if (i >= s1.length() || j >= s2.length()) {
            return 0;
        }

        if (map[i][j] != -1)
            return map[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            int value = Math.max(
                    1 + lcs(s1, s2, i + 1, j + 1),
                    Math.max(
                            lcs(s1, s2, i + 1, j),
                            lcs(s1, s2, i, j + 1)));
            map[i][j] = value;
            return value;
        }
        int value = Math.max(
                lcs(s1, s2, i + 1, j),
                lcs(s1, s2, i, j + 1));
        map[i][j] = value;
        return value;
    }

    public int longestCommonSubsequence(String text1, String text2) {
        map = new int[text1.length()][text2.length()];
        for (int[] i : map) {
            Arrays.fill(i, -1);
        }
        return lcs(text1, text2, 0, 0);
    }
}
