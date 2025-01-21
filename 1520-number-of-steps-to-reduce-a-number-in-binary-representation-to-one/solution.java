class Solution {
    private String addOnes(String s) {
        int carry = 1;
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char a = s.charAt(i);
            if (a == '1' && carry == 1)
                str.append('0');
            else if (a == '0' && carry == 1) {
                str.append('1');
                carry = 0;
            } else
                str.append(a);
        }
        if(carry == 1){
            str.append('1');
        }
        return str.reverse().toString();
    }

    private String divideByTwo(String s) {
        return '0' + s.substring(0, s.length() - 1);
    }

    private boolean checkOne(String s){
        int n = s.length();
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == '1'){
                return false;
            }
        }
        if(s.charAt(n - 1) == '1') 
            return true;
        return false;
    }

    public int numSteps(String s) {
        int count = 0;
        while (!checkOne(s)) {
            if (s.charAt(s.length() - 1) == '1') {
                s = addOnes(s);
                count++;
            } else {
                s = divideByTwo(s);
                count++;
            }
        }

        return count;
    }
}

