class Solution {
    public int check(String co){
        int val = 0;
        val += co.charAt(0) - 'a' + 1;
        val += co.charAt(1) - '0';
        return val;
    }
    public boolean checkTwoChessboards(String c1, String c2) {
        int a = check(c1);
        int b = check(c2);
        System.out.println(a + " " +b);
        if((a%2 ==0 && b%2 == 0) || (a%2 != 0 && b%2 != 0)) return true;
        return false;
    }
}
