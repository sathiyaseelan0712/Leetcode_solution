class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = "";
        s += n;
        char[] arr = s.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(i%2 == 0){
                sum += arr[i] - '0';
            }else{
                sum -= arr[i] - '0';
            }
        }
        return sum;
    }
}
