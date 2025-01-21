class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder str2 = new StringBuilder();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                str2.append('0');
            } else {
                str2.append('1');
            }
        }
        num = Integer.parseInt(str2.toString(),2);
        return num;
    }
}
