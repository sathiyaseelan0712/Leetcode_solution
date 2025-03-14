class Solution {
    public boolean backTrack(char[][] b, String w, boolean[][] v, int i, int j, int idx, int r, int c) {
        if (idx == w.length())
            return true;
        if (i < 0 || j < 0 || i >= r || j >= c || v[i][j] || b[i][j] != w.charAt(idx)) {
            return false;
        }
        v[i][j] = true;
        if (backTrack(b, w, v, i + 1, j, idx + 1, r, c) ||
                backTrack(b, w, v, i - 1, j, idx + 1, r, c) ||
                backTrack(b, w, v, i, j + 1, idx + 1, r, c) ||
                backTrack(b, w, v, i, j - 1, idx + 1, r, c)) {
            return true;
        }
        v[i][j] = false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean res = backTrack(board, word, visited, i, j, 0, r, c);
                    if (res)
                        return true;
                }
            }
        }
        return false;
    }
}
