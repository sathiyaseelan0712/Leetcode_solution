class Solution {
    private boolean presentInCell(char[][] board, int row, int col){
        Set<Character> set = new HashSet<>();
        for(int i = row;i<row+3;i++){
            for(int j = col ; j<col+3;j++){
                if(board[i][j] != '.' && !set.add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean checkRow(char[][] board, int row, char val){
        int cnt = 0;
        for(int i = 0;i<9;i++){
            if(board[row][i] == val){
                cnt++;
            }
        }
        return cnt == 1 ? true : false; 
    }
    private boolean checkCol(char[][] board, int col, char val){
        int cnt = 0;
        for(int i = 0;i<9;i++){
            if(board[i][col] == val){
                cnt++;
            }
        }
        return cnt == 1 ? true : false; 
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] != '.' && (!checkCol(board, j, board[i][j]) || !checkRow(board, i, board[i][j]))){
                    return false;
                }
            }
        }
        for(int i = 0;i<9;i=i+3){
            for(int j = 0;j<9;j=j+3){
                if(!presentInCell(board, i ,j)){
                    return false;
                }
            }
        }
        return true;
    }
}
