class Solution {
    public int changeNumber(int num,int idx){
        String s = Integer.toString(num);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==idx){
                if(s.charAt(i) == '9') str.append('6');
                else str.append('9');
                continue;
            }
            str.append(s.charAt(i));
        }
        return Integer.parseInt(str.toString());
    }
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int max = num;
        for(int i=0;i<s.length();i++){
            int val = changeNumber(num,i);
            if(val>max) max =val;
        }
        return max;
    }
}
