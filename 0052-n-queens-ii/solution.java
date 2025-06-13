class Solution {
    public boolean canPlace(int row, int col, List<String> cur){
        for(int i = row-1;i>=0;i--){
            if(cur.get(i).charAt(col) == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(cur.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j=col+1;i>=0&&j<cur.size();i--,j++){
            if(cur.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        return true;
    }
    void backTrack(int row,List<String> cur, List<List<String>> res, int n){
        if(row == n){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0;i<n;i++){
            if(canPlace(row,i,cur)){
                StringBuilder sb = new StringBuilder(cur.get(row));
                sb.setCharAt(i,'Q');
                cur.set(row,sb.toString());
                backTrack(row+1,cur,res,n);
                sb.setCharAt(i,'.');
                cur.set(row,sb.toString());
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        String str = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            cur.add(str);
        }
        backTrack(0,cur,res,n);
        return res.size();
    }
}
