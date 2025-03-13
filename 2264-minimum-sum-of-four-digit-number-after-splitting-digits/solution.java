class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            int  rem = num %10;
            arr[i] = rem;
            num /= 10;
        }
        Arrays.sort(arr);
        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];
        return num1 + num2;
    }
}
